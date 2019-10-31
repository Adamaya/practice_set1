package oop_mod2_questions.multi_threading;

class NewThread extends Thread {
    Thread t;

    NewThread() {
        t = new Thread(this, "Demo_thread");
    }

    public void run() {
        for (int i = 0; i < 100; i = i + 2) {
            System.out.println("Even " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class NewThread1 implements Runnable {
    Thread t;

    NewThread1() {
        t = new Thread(this, "Demo_thread");
    }

    public void run() {
        for (int i = 1; i < 100; i = i + 2) {
            System.out.println("Odd " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}


public class Thread1 {
    public static void main(String[] args) {
//        NewThread nt=new NewThread();
//        NewThread1 nt1=new NewThread1();
//        nt1.t.start();
//        nt.t.start();
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().stop();
        System.out.println(Thread.currentThread().getState());
    }
}
