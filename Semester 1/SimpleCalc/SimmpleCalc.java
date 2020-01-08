
/**
 * Write a description of class SimmpleCalc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SimmpleCalc
{
    private int num1= 10;
    private int num2=3;
    
   
    public double add()
    {
        return (double) num1 + num2;
        
    }
    public double subtract(){
        return (double) num1 - num2;
        
    }
    public double multiply(){
        return (double) num1 * num2;
        
    }
    public double divide(){
        return (double) num1/num2;
    
    }
    public int moduloDivide(){
        return num1%num2;
        
    }
}
