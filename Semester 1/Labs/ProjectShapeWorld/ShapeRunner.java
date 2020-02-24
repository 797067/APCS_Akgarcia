
/**
 * Write a description of class ShapeRunner here.
 *
 * @author (Kayla Garcia)
 * @version (827)
 */
public class ShapeRunner
{
 public static void main(){
      ShapeWorld shapeWorld = new ShapeWorld (500,500);
      
      APCSRectangle r = new APCSRectangle(250, 250, 350 ,350);
      shapeWorld.addRectangle(r);
      
      APCSTriangle t = new APCSTriangle(200, 250, 300, 150, 400, 250);
      shapeWorld.addTriangle(t);
      
      APCSCircle c = new APCSCircle ( 100, 310, 10);
      shapeWorld.addCircle(c);
      
      APCSLine l = new APCSLine ( 100,  310, 100, 340);
      shapeWorld.addLine(l);
      
      APCSLine l1= new APCSLine (90, 325, 110, 325);
      shapeWorld.addLine(l1);
      
      APCSLine l2 = new APCSLine (100,340, 110, 350);
      shapeWorld.addLine(l2);
      
      APCSLine l3 = new APCSLine (100,340, 90, 350);
      shapeWorld.addLine(l3);
    }
     
}