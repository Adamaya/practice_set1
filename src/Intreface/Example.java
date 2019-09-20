package Intreface;

class A {
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}

class B implements A.NestedIF {
    @Override
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}

public class Example {
    public static void main(String[] args) {
        A.NestedIF nif = new B();
        if (nif.isNotNegative(10)) {
            System.out.println("10 is not negative");
        }
        if (nif.isNotNegative(-12)) {
            System.out.println("12 is not negateive number");
        }
    }
}