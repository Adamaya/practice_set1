package Question9;

import java.util.Scanner;

public class Solution9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        input.close();
        if (name.equals(name.toLowerCase())) {
            System.out.println(name.toUpperCase());
        } else {
            System.out.println(name.toLowerCase());
        }

    }
}
