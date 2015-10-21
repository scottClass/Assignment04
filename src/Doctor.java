
import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johns6971
 */
public class Doctor {
    
    private int row;
    private int col;
    
    public Doctor(int startRow, int startCol) {
        row = startRow;
        col = startCol;  
    }
    
    public void move(int row, int col) {
        this.row = row;
        this.col = col;
    }
    
    public void teleport(int row, int col) {
        int min = 0;
        int max = 7; 
        row = random(min, max);
        col = random(min, max);
        this.row = row;
        this.col = col;
    }
    
    public int getRow() {
        return this.row;
    }
    
    public int getCol() {
        return this.col;
    }
    
    private int random(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }
            
}
