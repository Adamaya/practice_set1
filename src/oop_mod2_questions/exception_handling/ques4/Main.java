package oop_mod2_questions.exception_handling.ques4;

public class Main {
    public static void main(String[] args) {
        String string = "stringoutofbound";
        try {
            int index = 0;
            char[] stringArray = string.toCharArray();
            while (index >= 0) {
                System.out.print(stringArray[index++]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred");
        }
    }
}
