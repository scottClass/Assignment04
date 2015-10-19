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
    private boolean hasCrashed;
    
    public Dalek(int startRow, int startCol) {
        row = startRow;
        col = startCol;
    }
    
    public void advanceTowards(Doctor doc) {
        
    }
    
    public void crash() {
        
    }
    
    public boolean hasCrashed() {
        return hasCrashed = true;
    }
    
    public int getRow() {
        return this.row;
    }
    
    public int getCol() {
        return this.col;
    }
    
}
