package Question14;

import java.util.Scanner;



public class Solution14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num = input.nextLine();
        input.close();
//        int i=0;
//        while(i<length(num)
        String num1 = "";
        for (int i = num.length(); i < 0; i--) {
            num1 += num[i];
        }
        System.out.println(num1);

    }
}
