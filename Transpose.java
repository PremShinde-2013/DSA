public class Transpose {
    public static void main(String[] args) {

        int[][] original = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

        int[][] trans = new int[3][3];

        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                trans[i][j] = original[j][i];
            }
        }

        System.out.println("Transpose array");
        for (int i = 0; i < trans.length; i++) {
            for (int j = 0; j < trans[i].length; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
