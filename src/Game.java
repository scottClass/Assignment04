
import java.awt.Color;
import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lamonta
 */
public class Game {

    public static int randInt(int min, int max) {

        // Usually this can be a field rather than a method variable
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int min = 0;
        int max = 7;

        boolean done = false;

        GameBoard board = new GameBoard();

        Doctor doc = new Doctor(5, 5);
        Dalek d1 = new Dalek(randInt(min, max), randInt(min, max));
        Dalek d2 = new Dalek(randInt(min, max), randInt(min, max));
        Dalek d3 = new Dalek(randInt(min, max), randInt(min, max));

        while (!done) {
            board.putPiece(doc.getRow(), doc.getCol(), Color.blue);
            board.putPiece(d1.getRow(), d1.getCol(), Color.red);
            board.putPiece(d2.getRow(), d2.getCol(), Color.red);
            board.putPiece(d3.getRow(), d3.getCol(), Color.red);

            board.removePiece(d1.getRow(), d1.getCol());
            board.removePiece(d2.getRow(), d2.getCol());
            board.removePiece(d3.getRow(), d3.getCol());

            d1.advanceTowards(doc);
            d2.advanceTowards(doc);
            d3.advanceTowards(doc);

            board.putPiece(d1.getRow(), d1.getCol(), Color.red);
            board.putPiece(d2.getRow(), d2.getCol(), Color.red);
            board.putPiece(d3.getRow(), d3.getCol(), Color.red);

            Coordinate c = board.getClick();
            board.removePiece(doc.getRow(), doc.getCol());
            int row = c.getRow();
            int col = c.getCol();
            doc.move(row, col);
            

        }
    }
}
