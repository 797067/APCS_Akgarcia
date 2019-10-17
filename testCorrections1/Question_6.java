
/**
 * Write a description of class Question_6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question_6
{
    public static void main(){
        int [] evens = new int[4];  
        evens[4] = (int)(Math.random() * 4);
        if(evens[4]%2!=0){
            System.out.println(evens[4]);
        }else{
            while (evens[4] %2 == 0 ){
                evens[4] = (int)(Math.random() * 4);
            }
            System.out.println(evens[4]);
        }      
    }
}
