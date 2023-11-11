public class Palindrome {
    public static void main(String[] args) {

        String str = "rawiar";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            rev = rev + str.charAt(i);

        }

        if (str.toLowerCase().equals(rev.toLowerCase())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not");
        }

    }
}
