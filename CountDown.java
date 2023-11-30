public class CountDown {

    public static void main(String[] args) {
        int count = 10;

        for (int i = count; i >= 0; i--) {

            System.out.println("Time " + i + "Seconds");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}