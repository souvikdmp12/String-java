import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string:");
        String str = sc.next();
        String reversestr = " ";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversestr = reversestr + str.charAt(i);
        }

        System.out.println("Reverse String : " + reversestr);
    }

}
