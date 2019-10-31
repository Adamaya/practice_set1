package oop_mod2_questions.multi_threading.ques3;

class NewThread1 implements Runnable {
    Thread t;

    NewThread1() {
        t = new Thread(this, "Demo thread");
    }

    public void run() {
        for (int i = 0; i < 100; i = i + 2) {
            System.out.println("Even1: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "Demo thread");
    }

    public void run() {
        for (int i = 0; i < 100; i = i + 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        NewThread nt = new NewThread();
        nt.t.start();
        System.out.println(nt.t.getPriority());

        for (int i = 1; i < 100; i = i + 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupt");
            }
        }
    }
}
