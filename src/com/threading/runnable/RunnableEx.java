package com.threading.runnable;

public class RunnableEx implements Runnable{
    private int number;

    public RunnableEx(int number){
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++){
            System.out.println(i + " from thread: " + number);
//            if (number == 3){
//                throw new RuntimeException();
//            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
