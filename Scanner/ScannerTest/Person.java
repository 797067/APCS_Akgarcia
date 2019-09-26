
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private String fName = " ";
    private String mName = " ";
    private String lName = " ";

    public Person(String fullName){
        String inputStr = "";
        int si = inputStr.indexOf(" ");
        fName = inputStr.substring(0, si);
        lName = inputStr.substring(si + 1);
        if(si+1 != inputStr.lastIndexOf(" ")){
            fullName = fName + lName;}
            else{ 
            fullName = fName + mName + lName;
        }
        
    }
}

