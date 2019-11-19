
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
            if(i == 1){ // add student
                System.out.println("--------------------");
                System.out.println("Input Name ");
                System.out.println("--------------------");
                String name = kb.nextLine();
                System.out.println("--------------------");
                System.out.println("Input Student Number ");
                System.out.println("--------------------");
                int stuNumber = kb.nextInt();
                System.out.println("--------------------");
                System.out.println("Input Gpa ");  
                System.out.println("--------------------");
                double gpa = kb.nextDouble();
                studListRunner.studList.addStudent(name, stuNumber, gpa);
                kb.nextLine();
            }
            if(i == 2){ // remove student
                System.out.println("--------------------");
                System.out.println("Would you like to remove a student by their last name or student number? ");
                System.out.println("--------------------");
                String kbName = kb.next();
                if(kbName.equals ("Number") || kbName.equals("number") || kbName.equals("Student Number") || kbName.equals("student number")){
                    System.out.println("--------------------");
                    System.out.println("To remove a student type their Student Number ");
                    System.out.println("--------------------");
                    int kbNumber = kb.nextInt();
                    studListRunner.studList.deleteStudent(kbNumber);
                } else {    
                    System.out.println("--------------------");
                    System.out.println("To remove a student type their Last Name");
                    System.out.println("--------------------");
                    String kbLastName = kb.next();
                    studListRunner.studList.deleteStudent(kbLastName);
                }
            }
            if(i== 3){ // print list

                studListRunner.studList.printList();
            }
            if(i == 4){ // remove all students
                System.out.println("--------------------");
                System.out.println("Removing Students ");
                System.out.println("--------------------");
                studListRunner.studList.clearList();
            }
            
        }
    }

    public int menuNumber(){
        System.out.println("--------------------");
        System.out.println("1. Add Student ");
        System.out.println("2. Delete Student ");
        System.out.println("3. Print List ");
        System.out.println("4. Clear List ");
        System.out.println("--------------------");
        System.out.println("Pick an option or type \"quit\" to quit");
        System.out.println("--------------------");
        Scanner kb = new Scanner(System.in); 
        int inputI = kb.nextInt();
        return inputI;
    }
}
