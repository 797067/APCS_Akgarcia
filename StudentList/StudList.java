
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
            if (student.getLastName() == inputString){
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

    public void clearList(){
        for(int i = 0; i < studList.size(); i++){
            Student student = studList.get(i);
            studList.remove(student);
        }
    }

    public void printStudent(String lastName){
        Student foundStudent = null;
        for(int i = 0; i < studList.size(); i++){
            
            Student student = studList.get(i);
            if (student.getLastName().equals( lastName)){
                foundStudent = student;
                System.out.println(studList.get(i).getFirstName());
                System.out.println(studList.get(i).getStuNumber());
                System.out.println(studList.get(i).getGpa());
            }
        }
        if(foundStudent == null){
            System.out.println("Student Does Not Exist");
        }
    }
}

        

