package exceptionalhandling;

public class Exc0 {
    static void division() {
        int d = 0;
        int i = 10 / d;
    }

    public static void main(String[] args) {
        try {
            Exc0.division();
        } catch (ArithmeticException e) {
            System.out.println("ArithmaticException Occured");
        }

    }
}


