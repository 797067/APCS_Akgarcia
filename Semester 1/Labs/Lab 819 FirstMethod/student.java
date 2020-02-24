
/**
 * Write a description of class student here.
 *
 * @author (Kayla Garcia)
 * @version (821)
 */
public class student
{
    // instance variables - replace the example below with your own
    private String stuName;
    private int stuNumber;
    
   public student(String name, int num){
       stuName = name;
       stuNumber = num;
       
    }
    //methods
    public String getName(){
        return stuName;
    }
    
    public int getNumber(){
        return stuNumber;
    }
}

