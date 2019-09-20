package Intreface;

interface Human {
    public void body();

    public void speak();

    public void watch();
}

class humanBehaviour implements Human {
    public void body() {
        System.out.println("Strong body");
    }

    public void speak() {
        System.out.println("Bold voice");
    }

    public void watch() {
        System.out.println("watch precisely");
    }
}

public class Example1 {
    public static void main(String[] args) {
        humanBehaviour hmnBhr = new humanBehaviour();
        hmnBhr.body();
        hmnBhr.speak();
        hmnBhr.watch();
    }
}
