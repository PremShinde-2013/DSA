public class ReverseString {
    public static void main(String[] args) {

        String Original = "Prem";
        String Reverse = "";

        // for (int i = 0; i < Original.length(); i++) {
        // Reverse = Original.charAt(i) + Reverse;
        // }
        // System.out.println(Reverse);

        for (int i = (Original.length() - 1); i >= 0; i--) {

            Reverse = Reverse + Original.charAt(i);

        }
        System.out.println(Reverse);

    }
}
