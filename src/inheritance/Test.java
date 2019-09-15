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

    public void sum() {
        System.out.println("sum of i+k+j: " + (i + j + k));
    }
}
public class Test {
    public static void main(String[] args) {
        Parent superOb = new Parent();
        Child childOb = new Child();
        superOb.i = 10;
        superOb.j = 20;
        childOb.k = 30;
        superOb.showij();
        childOb.showk();
        //here childOb.showk() returns value of k only because in inheritance it child class only inherits the variables
        // but not there actual value until they are not initialized in their child class.
        childOb.sum();
        childOb.i = 1;
        childOb.j = 2;
        childOb.k = 3;
        childOb.sum();
    }
}
