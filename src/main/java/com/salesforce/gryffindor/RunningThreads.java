package com.salesforce.gryffindor;

public class RunningThreads {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println("Doing something awesome");
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(7000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Adolfo is awesome!");
            }
        };

        Thread t2 = new Thread(() -> {
            System.out.println("Doing something awesome in T2");
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Vadim is awesome!");
        });

        //t2.setDaemon(true);

        t1.start();
        t2.start();

        try {
            t2.join();
            System.out.println("T2 is done");
            t1.join();
            System.out.println("T1 is done");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
