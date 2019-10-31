package oop_mod2_questions.wrapper_class.ques3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        //Autoboxing: automatically generating Integer.valueOf(5)
        arrayList.add(5);
        //Unboxing
        System.out.println(arrayList.get(0));
    }
}
