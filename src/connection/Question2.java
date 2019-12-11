package connection;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) throws IndexOutOfBoundsException{
        Scanner scanner=new Scanner(System.in);
        int sizeOfArray=scanner.nextInt();
        int[] array=new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            array[i]=i;
        }
        int indexNumber=scanner.nextInt();
        try{
            System.out.println(array[indexNumber]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBound");
        }
    }
}
