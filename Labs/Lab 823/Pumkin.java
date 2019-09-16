
/**
 * Write a description of class Pumkin here.
 *
 * @author (Kayla Garcia)
 * @version (823)
 */
public class Pumkin
{
    // instance variables - replace the example below with your own
    private double rad; // declare
    private int id;

    /**
     * Constructor for objects of class Pumkin
     */
    public Pumkin(double r, int id)
    {
       rad = r;
       this.id = id;
    }

    public double getRadius()
    {
        // put your code here
        return rad;
    }
    
    public int getId(){
        return id;
    }
    
}
