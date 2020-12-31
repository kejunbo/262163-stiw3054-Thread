package com.kejunbo;

public class Main extends Thread implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello Thread"+ Thread.currentThread().getName());
    }

    public static void main(String[] args) {
	// write your code here

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());

        Main myRunnable = new Main();
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);
        Thread t3 = new Thread(myRunnable);
        t1.start();
        t2.start();
    }
}
