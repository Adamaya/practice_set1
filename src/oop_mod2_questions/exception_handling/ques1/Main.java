package oop_mod2_questions.exception_handling.ques1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyFirstException {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;
        if (sum > 150) {
            System.out.println(sum);
        } else {
            throw new MyFirstException("Custom Exception Occurred");
        }
    }
}
