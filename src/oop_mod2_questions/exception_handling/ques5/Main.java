package oop_mod2_questions.exception_handling.ques5;


public class Main {
    public static void main(String[] args) {
        Object object = 6;
        try {
            System.out.println(Integer.valueOf((String) object));
            ;
        } catch (ClassCastException e) {
            System.out.println("typeCasting cannot be performed");
        }
    }
}
