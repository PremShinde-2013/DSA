package C_P;
import java.util.Random;
import java.util.Scanner;

public class MinesweeperProblem {
      private static final int SIZE = 5;
    private static final int MINES = 5;
    private static char[][] board = new char[SIZE][SIZE];
    private static boolean[][] mines = new boolean[SIZE][SIZE];
    private static boolean[][] revealed = new boolean[SIZE][SIZE];

    public static void main(String[] args) {
        initializeBoard();
        placeMines();
        while (true) {
            displayBoard();
            if (checkWin()) {
                System.out.println("Congratulations! You've cleared the minefield!");
                break;
            }
            playTurn();
        }
    }

    private static void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '-';
            }
        }
    }

    private static void placeMines() {
        Random rand = new Random();
        int minesPlaced = 0;
        while (minesPlaced < MINES) {
            int row = rand.nextInt(SIZE);
            int col = rand.nextInt(SIZE);
            if (!mines[row][col]) {
                mines[row][col] = true;
                minesPlaced++;
            }
        }
    }

    private static void displayBoard() {
        System.out.println("  0 1 2 3 4");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < SIZE; j++) {
                if (revealed[i][j]) {
                    System.out.print(board[i][j] + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }

    private static void playTurn() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row and column (e.g., '2 3'): ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        if (mines[row][col]) {
            System.out.println("Game over! You stepped on a mine.");
            displayMines();
            System.exit(0);
        }
        int adjacentMines = countAdjacentMines(row, col);
        board[row][col] = (char) (adjacentMines + '0');
        revealed[row][col] = true;
    }

    private static int countAdjacentMines(int row, int col) {
        int count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < SIZE && j >= 0 && j < SIZE && mines[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean checkWin() {
        int unrevealedCount = SIZE * SIZE - MINES;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (revealed[i][j]) {
                    unrevealedCount--; 
                }
            }
        }
        return unrevealedCount == 0;
    }

    private static void displayMines() {
        System.out.println("Here are the mines:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (mines[i][j]) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }


}
