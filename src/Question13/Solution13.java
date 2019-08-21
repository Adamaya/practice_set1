package Question13;

import java.util.Scanner;

public class Solution13 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        while (num > 0) {
            int remainder = num % 10;
            sum += remainder;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
