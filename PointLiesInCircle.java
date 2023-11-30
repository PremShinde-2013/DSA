public class PointLiesInCircle {

    public static void main(String[] args) {
        double centerx = 1;
        double centery = 2;
        double radius = 5;
        double pointx = 5;
        double pointy = 1;

        double distance = Math.sqrt(Math.pow(pointx - centerx, 2) + Math.pow(pointy - centery, 2));

        if (distance < radius) {
            System.out.println("point is inside");

        } else {

            System.out.println("point is outside");
        }

    }
}