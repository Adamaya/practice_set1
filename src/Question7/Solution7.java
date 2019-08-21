package Question7;

import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char data = input.next().charAt(0);
        input.close();
        int ascii = data;
        System.out.println(ascii);
        if (ascii >= 97 && ascii <= 122 || ascii >= 65 && ascii <= 90) {
            System.out.println("Alphabet");
        } else if (ascii >= 48 && ascii <= 57) {
            System.out.println("Digit");
        } else if (ascii >= 33 && ascii <= 47) {
            System.out.println("Special Character");
        }

    }
}
