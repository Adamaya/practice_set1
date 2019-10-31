package oop_mod2_questions.exception_handling.ques3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        try {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            sum = num1 + num2;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Sum: " + sum);

    }
}
