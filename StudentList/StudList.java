
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
    
    public StudList(){
      
    
    }
    
    public void addStudent(String fullName, int stuNumber, double gpa){
        

        Student student = new Student(stuNumber,gpa,fullName);
        studList.add(student);
    }

    public void deleteStudent(int inputNumber){
       for(int i = 0; i< studList.size(); i++){
        Student student = studList.get(i);
        if(student.getStuNumber() == inputNumber){
            studList.remove(i);
        }
        }
    }
    
    public void deleteStudent(String inputString){
        for(int i = 0; i < studList.size(); i++){
            Student student = studList.get(i);
            if (student.getFirstName() == intputString){
                studList.remove(i);
            }
        }
    
    }
    
    public void printList(){
        for(int i = 0; i < studList.size(); i++){
            Student student = studList.get(i);
            System.out.println(studList.get(i).getFirstName());
            System.out.println(studList.get(i).getStuNumber());
            System.out.println(studList.get(i).getGpa());
        }
        }
    }
            
        
        
    

