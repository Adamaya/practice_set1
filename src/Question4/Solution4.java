package Question4;

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        if (number < 0) {
            System.out.println("negetive");
        } else if (number > 0) {
            System.out.println("positive");
        } else {
            System.out.println("zero");
        }
    }
}
