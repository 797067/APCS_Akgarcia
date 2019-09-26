
/**
 * Write a description of class Runner here.
 *
 * @author (Kayla)
 * @version (926)
 */
import java.util.Scanner;
public class Runner
{
    public static void main(){
        Scanner Person = new Scanner(System.in); 
        String inputStr = "";

        while(!inputStr.equals("quit")){
            System.out.println("Enter a name or type \"quit\" to quit");
            inputStr = Person.nextLine();
            System.out.println(inputStr);
        }
        
        
        
        
    }
}
