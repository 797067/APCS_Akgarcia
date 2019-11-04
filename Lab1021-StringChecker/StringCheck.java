
/**
 * StringCheck 
 *
 * @author Kayla Garcia
 * @version 1031
 */
import java.util.*;
public class StringCheck
{
    public static void main(){
        System.out.print("Type the Key ");
        Scanner kb = new Scanner(System.in);
        String key = kb.nextLine();
        ArrayList<String> wordList = new ArrayList<String>();
        for(int i=0; i<3; i++ ){
            System.out.print("Type a Word ");
            String word = kb.nextLine();
            wordList.add(word);
            
        }
        StringCheck stringCheck = new StringCheck();
       
        String[]wordArray = stringCheck.wordChecker(wordList, key);
        for(int i = 0; i< wordArray.length; i++){
            System.out.println(wordArray[i]);
        }
    }
    
    public ArrayList<String> wordChecker (String [] str, String key){
        ArrayList<String>wordList = new ArrayList<String>();
        int resultIndex = 0;
        for(int i=0; i<str.length; i++){
            if(str[i] != null ){
                if(str[i].indexOf(key) != -1){
                    wordList.add(str[i]);
                
                }
            }
        
        }
        return wordList;
    }
    
    public String[] wordChecker(ArrayList<String> str, String key){
        String[] resultArray = new String[str.size()];
        int resultIndex = 0;
        for(int i=0; i<str.size(); i++){
            String word = str.get(i);
            
            if(word.indexOf(key)!=-1){
                resultArray[resultIndex] = word;
                resultIndex ++;
            }
        }
        return resultArray;
    }
    
    
}
