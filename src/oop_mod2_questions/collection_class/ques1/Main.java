package oop_mod2_questions.collection_class.ques1;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(10);
        HashSet<Integer> hashSet = new HashSet<>(10);
        for (int i = 0; i < 9; i++) {
            arrayList.add(i);
        }
        for (int i = 0; i < 9; i++) {
            hashSet.add(i);
        }
        arrayList.add(5);
        hashSet.add(5);
        arrayList.addAll(2, arrayList);
        System.out.println(arrayList);
        System.out.println(hashSet);
    }
}
