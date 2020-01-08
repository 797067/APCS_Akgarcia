
/**
 * Write a description of class MazeWalker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MazeWalker
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MazeWalker
     */
    public MazeWalker()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void walkMaze(Maze maze, MazeBot mazeBot)
    {
    while(mazeBot.canMoveForward()==true){
        mazeBot.moveForward();
    }
    
        mazeBot.turnRight();
    while(mazeBot.canMoveForward()==true){
        mazeBot.moveForward();
    }
        mazeBot.turnLeft();
    while(mazeBot.canMoveForward()==true){
        mazeBot.moveForward();
    }
        mazeBot.turnLeft();
   while(mazeBot.canMoveForward()==true){
        mazeBot.moveForward();
    }
        mazeBot.turnRight();
   while(mazeBot.canMoveForward()==true){
        mazeBot.moveForward();
    }
        mazeBot.turnRight();
   while(mazeBot.canMoveForward()==true){
        mazeBot.moveForward();
    }
        mazeBot.turnLeft();
   while(mazeBot.canMoveForward()==true){
        mazeBot.moveForward();
    }
        
        if(mazeBot.didReachGoal()==true){
            mazeBot.signalSuccess();
    }
    else{
        mazeBot.signalError();
    }
}
}
