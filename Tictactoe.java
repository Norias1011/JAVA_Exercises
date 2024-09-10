import java.util.Scanner;

public class Tictactoe {
    public static void main(String[] args) {
        boolean winner = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name Player 1?");
        String player1 = scanner.nextLine();
        System.out.println("What is your name Player 2?");
        String player2 = scanner.nextLine();

        System.out.println(player1 + " will be X and " + player2 + " will be O");

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if (j == 2)
                    System.out.println(matrix[i][j]);
                else
                    System.out.print(matrix[i][j] + "|");
            }
        }
        
    }
}
