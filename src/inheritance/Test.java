package inheritance;

class Parent {
    int i, j;

    public void showij() {
        System.out.println("value of i: " + i + " and j: " + j);
    }
}

class Child extends Parent {
    int k;

    public void showk() {
        System.out.println("value of k: " + k);
    }
}
public class Test {
    public static void main(String[] args) {

    }
}
