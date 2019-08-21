package Question6;

import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char char1 = input.next().charAt(0);
        char char2 = input.next().charAt(0);
        input.close();
        if (char1 < char2)
            System.out.println(char1 + " " + char2);
        else
            System.out.println(char2 + " " + char1);
    }
}
