public class RandomNo {
    public static void main(String[] args) {

        int min = 1;
        int max = 2;
        int range = max - min + 1;

        int Number = (int) (Math.random() * range) + min;

        System.out.println(Number);
    }
}
