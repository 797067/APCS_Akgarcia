
/**
 * Write a description of class GridTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GridTester
{
    public void loadArray(){
        int [][] grid = new int [10][10];
        for(int i=0 ; i< grid.length; i++ ){
            grid[i][grid[i].length] = (int)(Math.random()*10); 
        }
    }   
    public int sumAll(){
        this.loadArray();
        
        
        for(int i =0; i<grid.length;i++){}
    }
}
