
/**
 * Write a description of class StudList here.
 *
 * @author (Kayla Garcia)
 * @version (1029)
 */
import java.util.*;
public class StudList
{
    private ArrayList<Student> studList = new ArrayList<Student>();

    public void addStudent(){
        Scanner kb = new Scanner (System.in);
        System.out.println("Input Name ");
        String name = kb.nextLine();
        System.out.println("Input Student Number ");
        int stuNumber = kb.nextInt();
        System.out.println("Input Gpa ");    
        double gpa = kb.nextDouble();

        Student student = new Student(stuNumber,gpa,name);
        studList.add(student);
    }

    public void deleteStudent(String lastName){
        Scanner kb = new Scanner(System.in);
        System.out.println("To remove a student type their Last Name ");
        if(kb.equals(lastName)){ 
            String name = kb.nextLine(student.indexOf(lastName));
            double gpa = kb.nextDouble(student.indexOf(lastName));
            int stuNumber = kb.nextInt(student.indexOf(lastName));
            Student student = new Student(stuNumber,gpa,name);
            studList.remove(student);
        }
    }

    public void printList(){
        
        
    }

}