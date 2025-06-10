import chess.ChessMatch;
import javax.swing.UIClientPropertyKey;

public class Program {
    public static void main(String[] args) throws Exception {
        ChessMatch chess = new ChessMatch();
        System.out.println("Hello, World!");
        UI.printBoard(chess.getPieces());
    }
}
