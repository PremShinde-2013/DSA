public class CountVowels {
    public static void main(String[] args) {
        String str = "PremShinde";

        int vowelCount = 0;
        int consonentcount = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                vowelCount++;

            } else {
                consonentcount++;
            }

        }

        System.out.println("Vowel :" + vowelCount + " Consonent Count : " + consonentcount);

    }
}
