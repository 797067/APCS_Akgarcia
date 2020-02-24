
/**
 * Write a description of class StudentRunner here.
 *
 * @author (Kayla Garcia)
 * @version (821)
 */
public class StudentRunner
{
    public static void main() {
     
        student stu1 = new student("Bob", 2323232);
        System.out.print(stu1.getName());
        System.out.print(" - ");
        System.out.println(stu1.getNumber());
        
        student s2 = new student("Sam", 535353);
        System.out.print(s2.getName());
        System.out.print(" - ");
        System.out.println(s2.getNumber());
        
        student s3 = new student("Eric", 693781);
        System.out.print(s3.getName());
        System.out.print(" - ");
        System.out.println(s3.getNumber());
        
        
    }
}
