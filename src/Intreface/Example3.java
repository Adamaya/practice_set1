package Intreface;

class If {
    public interface Bird {
        void bodyB();

        void wings();
    }

    public interface Animal {
        void bodyA();

        void run();
    }
}

class Characterstics implements If.Bird, If.Animal {
    public void bodyB() {
        System.out.println("Light body");
    }

    public void wings() {
        System.out.println("2 wings");
    }

    public void bodyA() {
        System.out.println("Strong body");
    }

    public void run() {
        System.out.println("run");
    }
}

public class Example3 {
    public static void main(String[] args) {
        If.Bird bird = new Characterstics();
        bird.bodyB();
        bird.wings();
        If.Animal animal = new Characterstics();
        animal.bodyA();
        animal.run();
    }
}
