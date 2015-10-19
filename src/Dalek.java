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
    private boolean moved;
    private boolean hasCrashed;
    
    public Dalek(int startRow, int startCol) {
        row = startRow;
        col = startCol;
    }
    
    public void advanceTowards(Doctor doc) {
        moved = false;
        if(doc.getRow() < col ) {
            col --;
            moved = true;
        }
        if(doc.getCol() > col  ) {
            col ++;
            moved = true;
        }
        if(doc.getRow() < row && row > 0) {
            row --;
           moved = true;
        }
        if(doc.getRow() > row && row < 8) {
            row ++;
            moved = true;
        }
    }
    
    public void crash() {
        
    }
    
    public boolean hasCrashed() {
        return hasCrashed;
    }
    
    public int getRow() {
        return this.row;
    }
    
    public int getCol() {
        return this.col;
    }
    
}
