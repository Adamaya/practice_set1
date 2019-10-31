package oop_mod2_questions.wrapper_class.ques2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        //boxing
        arrayList.add(Integer.valueOf(5));
        //Unboxing
        System.out.println(arrayList.get(0));
    }
}
