import java.util.Scanner;
public class Play {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("Are you playing alone or with friends? 1 is friends and 0 is alone: ");
        int bot = scanner.nextInt();
        if(bot == 1){
            System.out.println("Player 1 is X, Player 2 is O");
            System.out.println("Enter the row and column to play");
            TicTacToe game = new TicTacToe();
        
            while(!game.isGameOver()) {
                game.printBoard();
                System.out.println("Enter the Row");
                int ro = scanner.nextInt();
                System.out.println("Enter the Column");
                int co = scanner.nextInt();
                game.play(ro, co);
                // your code here
            }
            scanner.close();
        }
        
        
        if(bot == 0){
            System.out.println("Player 1 is X, Player 2 is O");
            System.out.println("Enter the row and column to play");
            TicTacToe game = new TicTacToe();
        
            while(!game.isGameOver()) {
                game.printBoard();
                System.out.println("Enter the Row");
                int ro = scanner.nextInt();
                System.out.println("Enter the Column");
                int co = scanner.nextInt();
                game.play(ro, co);
                while( game.getCurrentPlayer() == 2){
                    int ranNum1 = (int) (Math.random() * 2);
                    int randNum2 = (int) (Math.random() * 2);
                    game.play(ranNum1, randNum2);
                }
                // your code here
            }
            scanner.close();
        }
    }
}
