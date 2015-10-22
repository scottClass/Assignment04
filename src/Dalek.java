
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johns6971
 */
public class Dalek {

    private int row;
    private int col;
    private boolean hasCrashed = false;

    public Dalek(int startRow, int startCol) {
        row = startRow;
        col = startCol;
    }
    /**
     * moves daleks to the doctor while they have not crashed
     * @param doc the player the daleks are moving toward 
     */
    public void advanceTowards(Doctor doc) {
        if (hasCrashed == false) {
            if (doc.getRow() < col) {
                col--;
            }
            if (doc.getCol() > col) {
                col++;
            }
            if (doc.getRow() < row) {
                row--;
            }
            if (doc.getRow() > row) {
                row++;
            }
        }
    }

    public void crash() {
        this.hasCrashed = true;
    }

    public boolean hasCrashed() {
        return this.hasCrashed;
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }
    
}
