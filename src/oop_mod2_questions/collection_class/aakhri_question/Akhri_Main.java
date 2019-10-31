package oop_mod2_questions.collection_class.aakhri_question;

import java.util.ArrayList;
import java.util.Scanner;

public class Akhri_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(scanner.nextInt());
        }
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            if (arrayList.get(i) % 2 == 0) {
                counter++;
            }
        }
        System.out.println("Number of Odds: " + (arrayList.size() - counter));
    }
}
