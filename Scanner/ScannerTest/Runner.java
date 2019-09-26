
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
        Scanner kb = new Scanner(System.in); 
        String inputStr = "";
        Person[] persons = new Person[2];
        while(!inputStr.equals("quit")){
            System.out.println("Enter a name or type \"quit\" to quit");
            inputStr = kb.nextLine();
            
            Person p1 = new Person(inputStr);
            System.out.println("First Name = " + p1.getFirstName());
            System.out.println("Middle Name = " + p1.getMiddleName());
            System.out.println("Last Name = " + p1.getLastName());
            
            
        }
          
    }    
    public Person[] extendArray(Person[] p, int n){
        
        
        } 
        
    }
    
    

