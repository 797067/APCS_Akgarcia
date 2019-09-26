
/**
 * Write a description of class Person here.
 *
 * @author (Kayla)
 * @version (926)
 */
public class Person
{
    private String fName = " ";
    private String mName = " ";
    private String lName = " ";
    private String fullName = " ";
String inputStr = "";
        int s = inputStr.indexOf(" ");
    public Person(String fullName){
         this.fullName=fullName;
        
    }
    
    public String parseName(){
         
        while(inputStr.indexOf(",")!=-1  ){ //1 or 2
            if(inputStr.indexOf(" ")!= inputStr.lastIndexOf(" ")){
                lName = inputStr.substring(0,s);        
                fName = inputStr.substring (s+1,inputStr.lastIndexOf(" "));
                mName = inputStr.substring(inputStr.lastIndexOf(" ")+1);
                String fullName = lName + fName + mName;
            }else{
                lName = inputStr.substring(0,s);
                fName = inputStr.substring (s+1);
                String fullname = lName = fName;
            } 
        }
        while(inputStr.indexOf(",")==-1){ // 3 or 4
            if(inputStr.indexOf(" ")!= inputStr.lastIndexOf(" ")){
                fName = inputStr.substring(0,s);        
                mName = inputStr.substring (s+1,inputStr.lastIndexOf(" "));
                lName = inputStr.substring(inputStr.lastIndexOf(" ")+1);
                String fullName = fName + mName + lName;
            }else{
                fName = inputStr.substring(0,s);
                lName = inputStr.substring (s+1);
                String fullName = fName + lName;
            }
        
        }                               

        return fullName;
    
    
    }
}

