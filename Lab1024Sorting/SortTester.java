
/**
 * Write a description of class SortTester here.
 *
 * @author (Kayla Garcia)
 * @version (1024)
 */
import java.util.*;

public class SortTester
{
    private static ArrayList<Integer> numList = new ArrayList<Integer>();

    public static void loadArray(ArrayList<Integer> numList, int numOfElements){
        for(int i = 0; i < numOfElements; i++){
            numList.add((int)(Math.random()*100)+1);

        }
    }

    public  void bubbleSort(){

        for(int i = numList.size() -1; i>0; i--){
            for(int j =0; j<i;j++){
                if (numList.get(j) > numList.get(j+1)){
                    
                    Collections.swap (numList,j, j+1);
                    System.out.println("Bubble sort: ");
                    System.out.println(numList);
                }
            }
        }

    }

    public  void insertSort(){
        int temp;
        for(int i=1; 1<numList.size();i++){
            for (int j = i; j >0 ; j --){
                if(numList.get(j) < numList.get(j-1)){
                    temp = numList.get(j);
                    j = i;
                    while ((j > 0) && (numList.get(j - 1) > temp)) {
                        numList.set(j, numList.get(j - 1));
                        j--;
                    }
                    numList.set(j, temp);
                    
                    System.out.println("Insertion Sort: ");
                    System.out.println(numList);
                }
            }
        }
    }        
}

    




