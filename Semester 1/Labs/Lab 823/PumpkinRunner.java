
/**
 * Write a description of class PumpkinRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PumpkinRunner
{
    public static void main(String[] args){
     
        Pumkin p1 = new Pumkin(3.4,12);
        Pumkin p2 = new Pumkin(7.6, 13);
        System.out.print(p1.getRadius());
        System.out.print( " - ");
        System.out.println(p1.getId());
       
        System.out.print(p2.getRadius()); // prints pumpkins radius and id
        System.out.print( " - ");
        System.out.println(p2.getId());
    } 
}
