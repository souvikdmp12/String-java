class CountChar {
    public static void main(String[] args) {
        String string = "Souvik Das Mahapatra";
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ')
                count++;
        }
        System.out.print("Total numbers of charecters in a string is: " + count);
    }
}