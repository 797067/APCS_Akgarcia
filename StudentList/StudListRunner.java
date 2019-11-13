
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

                System.out.println("Input Name ");
                String name = kb.nextLine();
                System.out.println("Input Student Number ");
                int stuNumber = kb.nextInt();
                System.out.println("Input Gpa ");    
                double gpa = kb.nextDouble();
                studListRunner.studList.addStudent(name, stuNumber, gpa);
            }
            if(i == 2){

                System.out.println("To remove a student type their Student Number ");
                int kbNumber = kb.nextInt();
                studListRunner.studList.deleteStudent(kbNumber);
            }
            if(i== 3){

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
