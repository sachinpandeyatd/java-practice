package com.threading;

public class Threading extends Thread{
    private int number;

    public Threading(int number){
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++){
            System.out.println(i + " from thread: " + number);
//            if (number == 3){
//                throw new RuntimeException();
//            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
