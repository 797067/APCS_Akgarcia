
/**
 * Write a description of class Person here.
 *
 * @author (Kayla Garcia)
 * @version (924)
 */
public class Person
{
    private String fName = " ";
    private String mName = " ";
    private String lName = " ";

    public Person(String fullName){
        // int s = fullName.indexOf(" ");
        // fName = fullName.substring(0,s);
        // lName = fullName.substring(s+1);
        if(fullName.indexOf(",") != -1){ // 1 or 2
            if(fullName.indexOf(" ")==fullName.lastIndexOf(" ")){//case 2
                int s = fullName.indexOf(" ");
                lName = fullName.substring(0,s-1);
                fName = fullName.substring(s+1);
                mName = "";
            } else {//case 1
                int s = fullName.indexOf(" ");
                lName = fullName.substring(0,s-1);
                fName = fullName.substring(s+1);
                mName = fullName.substring(s, fullName.lastIndexOf(" "));
            }

        }else{ // 3 or 4
            if(fullName.indexOf(" ")==fullName.lastIndexOf(" ")){ // case 4
                int s = fullName.indexOf(" ");
                fName = fullName.substring(0,s);
                lName = fullName.substring(s+1);
            }else{// case 3
                int s = fullName.indexOf(" ");
                fName = fullName.substring(0,s);
                mName = fullName.substring(s+1, fullName.lastIndexOf(" "));
                lName = fullName.substring(fullName.lastIndexOf(" ")+1);
            }
        }
    }

    public String parseName(){
        return 
    }
}}

