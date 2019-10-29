
/**
 * Write a description of class Student here.
 *
 * @author (Kayla Garcia)
 * @version (1029)
 */
public class Student
{   
    private String fName;
    private String mName;
    private String lName;
    private String fullName;
    private int stuNumber;
    private double gpa;
    
    public Student(int stuNumber){      
        this.stuNumber = stuNumber;
       
    }
    public Student(double gpa){      
        this.gpa = gpa;
       
    }
    public Student(String fullName){      
        this.fullName=fullName;
        parseName();
    }
    public void parseName(){
        int s = fullName.indexOf(" ");
        if(fullName.indexOf(",")!=-1  ){ //1 or 2
            if(fullName.indexOf(" ")!= fullName.lastIndexOf(" ")){
                lName = fullName.substring(0,s);        
                fName = fullName.substring (s+1,fullName.lastIndexOf(" "));
                mName = fullName.substring(fullName.lastIndexOf(" ")+1);
                String fullName = lName + fName + mName;
            }else{
                lName = fullName.substring(0,s);
                fName = fullName.substring (s+1);
                String fullname = lName = fName;
            } 
        } else{
            // 3 or 4
            if(fullName.indexOf(" ")!= fullName.lastIndexOf(" ")){
                fName = fullName.substring(0,s);        
                mName = fullName.substring (s+1,fullName.lastIndexOf(" "));
                lName = fullName.substring(fullName.lastIndexOf(" ")+1);
                String fullName = fName + mName + lName;
                
            }else{
                fName = fullName.substring(0,s);
                lName = fullName.substring (s+1);
                String fullName = fName + lName;
            }

        }                           
        
    }
    public String getFirstName(){
        return fName;
    }

    public String getMiddleName(){
        return mName;
    }

    public String getLastName(){
        return lName;
    }
    
    public void gpa(double gpa){
        this.gpa= gpa;
    
    }
    public double getGpa(){
        return this.gpa;
    }
    
    public void studentNumber(int studentNumber){
        this.stuNumber = stuNumber;
    }
    public int getStuNumber(){
        return this.stuNumber;
    }
}
