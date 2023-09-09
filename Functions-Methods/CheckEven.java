public class CheckEven {

    public static boolean isEven(int a) {

        if (a % 2 == 0) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        isEven(0);
        System.out.println(isEven(3));
    }
}
