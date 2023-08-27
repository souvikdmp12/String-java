public class palindrome {
    public static void main(String[] args) {
        String str = "Knyak";
        boolean flag = true;

        str = str.toLowerCase();
        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(i) != (str.charAt(str.length() - i - 1))) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("String is palindrome");
        } else
            System.out.println("String is not palindrome");

    }
}
