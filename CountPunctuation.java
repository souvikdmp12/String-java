public class CountPunctuation {
    public static void main(String[] args) {
        int count = 0;
        String str = "I,am ; souvik /";
        for (int i = 0; i <= str.length(); i++) { // check whether given charecter is puncuation mark
            if (str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.'
                    || str.charAt(i) == '?' || str.charAt(i) == '-' ||
                    str.charAt(i) == '\'' || str.charAt(i) == '\'' || str.charAt(i) == ':')
                count++;
        }
        System.out.println("The number of punctuations exists in the string is: " + count);

    }
}
