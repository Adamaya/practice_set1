package oop_mod2_questions.wrapper_class.ques4;

import java.util.ArrayList;


public class Main {
    public static int sum(ArrayList<Integer> number) {
        int sum = 0;
        for (int i = 0; i < number.size(); i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static double average(double sum, ArrayList<Integer> array) {
        return sum / array.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(i);
        }
        System.out.println(sum(arrayList));
        System.out.println(average(sum(arrayList), arrayList));
    }
}
