package oop_mod2_questions.exception_handling.ques2;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No command line arguments are passed");
        } else {
            int arrayLength = Integer.parseInt(args[0]);
            int[] array = new int[arrayLength];
            array[arrayLength + 1] = 5;
        }
    }
}
