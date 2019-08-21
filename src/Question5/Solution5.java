package Question5;

import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        int num1;
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        input.close();
        for (int i = 2; i < num1; i++) {
            if (num1 % i == 0) {
                System.out.println("not Prime number");
                break;
            } else {
                System.out.println("Prime number");
                break;
            }
        }
    }
}
