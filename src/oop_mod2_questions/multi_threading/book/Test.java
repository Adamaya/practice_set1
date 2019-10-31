package oop_mod2_questions.multi_threading.book;

class EvenThread extends Thread {
    Thread t;

    EvenThread() {
        t = new Thread(this, "Even_Thread");
    }

    public void run() {
        for (int i = 0; i < 100; i = i + 2) {
            System.out.println("Even " + i);

            try {
                Thread.sleep(1000);
            } catch (Exception ae) {
                System.out.println(ae);
            }
        }
    }
}

class OddThread extends Thread {
    Thread t;

    OddThread() {
        t = new Thread(this, "Odd_Thread");
    }

    public void run() {
        for (int i = 1; i < 100; i = i + 2) {
            System.out.println("Odd " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Test {
    public static void main(String[] args) {
        EvenThread et = new EvenThread();
        OddThread ot = new OddThread();
        ot.t.setPriority(10);
        et.t.start();
        ot.t.start();


    }

}
