public class StringMethods {

    public static void printstring(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String name = "Prem Shinde";
        System.out.println(name.charAt(0));
        printstring(name);

    }

}