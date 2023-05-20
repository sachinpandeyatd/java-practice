package com.threading.synch.onlinestoreproblem;

class Store {
  private int productQuantity = 5;

  public synchronized void buyProduct(int customerId) {
    if (productQuantity > 0) {
      System.out.println("Customer " + customerId + " is buying product");
      productQuantity--;
      System.out.println("Product quantity now: " + productQuantity);
    } else {
      System.out.println("Product out of stock");
    }
  }
}

class Customer implements Runnable {
  private Store store;
  private int customerId;

  public Customer(Store store, int customerId) {
    this.store = store;
    this.customerId = customerId;
  }

  public void run() {
    store.buyProduct(customerId);
  }
}

public class Main {
  public static void main(String[] args) {
    Store store = new Store();
    for (int i = 1; i <= 10; i++) {
      Customer customer = new Customer(store, i);
      Thread th = new Thread(customer);
      th.start();
    }
  }
}
