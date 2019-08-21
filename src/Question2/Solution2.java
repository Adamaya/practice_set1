package Question2;
import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String name=input.nextLine();
        input.close();
        String[] list=name.split(" ",5);
        System.out.println(list[0]+" University "+list[1]);
    }
}
