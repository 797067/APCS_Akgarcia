
/**
 *StudListRunner
 *
 * @author (Kayla Garcia)
 * @version (1025)
 */
import java.util.*;
public class StudListRunner
{
    StudList studList = new StudList();
    public static void main(){
        StudListRunner studListRunner = new StudListRunner();
        
        Scanner kb = new Scanner(System.in); 
        String inputStr = "";

        while(!inputStr.equals("quit")){
            int i = studListRunner.menuNumber();
            if(i == 1){
               studListRunner.studList.addStudent();
            }
            if(i == 2){
               studListRunner.studList.printList();
            }
        }
    }
    
    public int menuNumber(){
    System.out.println("Pick an option or type \"quit\" to quit");
    Scanner kb = new Scanner(System.in); 
            int inputI = kb.nextInt();
            return inputI;
    }
}
