
/**
 * Write a description of class MyPicture here.
 *
 * @author (Kayla Garcia)
 * @version (829)
 */
import java.awt.*;
public class MyPicture
{
   public static void main(){

        Turtle   t;

        TurtleDrawingWindow win = new TurtleDrawingWindow();

        int      size, turn;

        t = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        
            t.jumpTo(10, 10);
        win.add(t);
        win.setVisible(true);
        t.penSize(8);
        size     = 100;    //logical units
        turn     = 123;    //in degree
        t.penColor(Color.green);
       for(int i = 0; i < 100; i++){
            t.move( size ); 
            t.turn( turn );
            String n = ""+i;
            //t.print(n);
        }
        t.jumpTo(-20, 20);
        t.heading(0);
        size     = 140;
        t.penColor(Color.red);
        t.penSize(8);
        for(int i = 0; i < 200; i++){
            t.move( size ); 
            t.turn( turn );
            String n = ""+i;
            //t.print(n);
        }
        t.penSize(8);
        t.jumpTo(30, 30);
        t.heading(0);
        size     = 280;
        t.penColor(Color.blue);
        for(int i = 0; i < 300; i++){
            t.move( size ); 
            t.turn( turn );
            String n = ""+i;
            //t.print(n);
        }

         t.penSize(8);
        t.jumpTo(-40, 40);
        t.heading(0);
        size     = 305;
        t.penColor(Color.yellow);
        for(int i = 0; i < 400; i++){
            t.move( size ); 
            t.turn( turn );
            String n = ""+i;
            //t.print(n);
        }
         t.penSize(5);
        t.jumpTo(-70, 30);
        t.heading(0);
        size     = 590;
        t.penColor(Color.orange);
        for(int i = 0; i < 500; i++){
            t.move( size ); 
            t.turn( turn );
            String n = ""+i;
            //t.print(n);
        }
         t.penSize(5);
        t.jumpTo(-60, 60);
        t.heading(0);
        size     = 405;
        t.penColor(Color.pink);
        for(int i = 0; i < 600; i++){
            t.move( size ); 
            t.turn( turn );
            String n = ""+i;
            //t.print(n);
        }

        
        t.hide();

    }
}