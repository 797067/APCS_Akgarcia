
/**
 *.
 *
 * @author (Kayla Garcia)
 * @version (1024)
 */
import java.util.*;

public class SortTester
{
    private  ArrayList<Integer> numList = new ArrayList<Integer>();
    private int arr[];
    public  void loadArray(ArrayList<Integer> numList, int numOfElements){
        for(int i = 0; i < numOfElements; i++){
            numList.add((int)(Math.random()*100)+1);

        }
    }

    public  void bubbleSort(){

        for(int i = numList.size() -1; i>0; i--){
            for(int j =0; j<i;j++){
                if (numList.get(j) > numList.get(j+1)){

                    Collections.swap (numList,j, j+1);

                }
            }
        }
        System.out.println("Bubble sort: ");
        System.out.println(numList);
    }

    public  void insertSort(){
        int temp;
        for(int i=1; 1<numList.size();i++){
            int j=i;
            while((j>0)&&numList.get(j)<numList.get(j-1)){
                Collections.swap(numList,j,j-1);
                j=j-1;
            }
        }
        System.out.println("Insertion Sort");
        System.out.println(numList);
    }      

    public void selectionSort(){
        for(int i=0; i<numList.size()-1; i++){
            int index =i;
            for(int j= i+1; j<numList.size(); j++){
                if(numList.get(j)<numList.get(index)){
                    index = j;
                }
            }
            int smallerNumber = numList.get(index);
            numList.set(index,numList.get(i));
            numList.set((i),smallerNumber);                      
        }
        System.out.println("Selection Sort");
        System.out.println(numList);
    }

    public void mergeSort(int []arr, int n){
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = arr[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(arr, l, r, mid, n - mid);
    }

    public static void merge(int [] arr, int[]l, int []r, int left,int right){
        int i=0,j=0,k=0;
        while(i<left&&j<right){
            if (l[i]<=r[j]){
                arr[k++]=l[i++];
            }else{
                arr[k++] = r[j++];
            }
        }
        while(i<left){
            arr[k++] = l[i++];}
        while(j<right){
            arr[k++] = r[j++];}
    }
}

