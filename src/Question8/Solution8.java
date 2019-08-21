package Question8;

import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String gender = input.nextLine();
        int age = input.nextInt();
        if (gender.equals("female") && age >= 1 && age <= 58) {
            System.out.println("8.2%");
        } else if (gender.equals("female") && age > 58 && age <= 100) {
            System.out.println("9.2%");
        } else if (gender.equals("male") && age >= 1 && age <= 58) {
            System.out.println("8.4%");
        } else if (gender.equals("male") && age > 58 && age <= 100) {
            System.out.println("10.5%");
        } else {
            System.out.println("Invailid Input");
        }
    }
}
