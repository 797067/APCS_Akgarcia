
/**
 * Write a description of class ClacRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClacRunner
{
    // instance variables - replace the example below with your own
    private int x;

    public static void main(){
    
        SimmpleCalc add1 = new SimmpleCalc();
        System.out.println(add1.add());
        
        SimmpleCalc sub1 = new SimmpleCalc();
        System.out.println(sub1.subtract());
        
        SimmpleCalc mult1 = new SimmpleCalc();
        System.out.println(mult1.multiply());
        
        SimmpleCalc div1 = new SimmpleCalc();
        System.out.println(div1.divide());
        
        SimmpleCalc mDiv = new SimmpleCalc();
        System.out.println(mDiv.moduloDivide());
    }
}
