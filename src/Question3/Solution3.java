package Question3;
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        input.close();
        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int dev = num1 / num2;
        System.out.println(num1 + "+" + num2 + "=" + sum);
        System.out.println(num1 + "-" + num2 + "=" + sub);
        System.out.println(num1 + "*" + num2 + "=" + mul);
        System.out.println(num1 + "/" + num2 + "=" + dev);
    }

}
