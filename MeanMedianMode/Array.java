
/**
 * Write a description of class Array here.
 *
 * @author (Kayla Garcia)
 * @version (910)
 */
public class Array
{
    
    int[] nums = new int[100];

    public void loadArray(){
        for(int i=0; i<nums.length; i++){
            nums [i] = (int) (Math.random()*10) +1;
        }
    }
    
    public void printArray(){
        for(int i=0; i<nums.length; i++){
             System.out.println(nums[i] + ",");
        }
    }
    
    public int getSum(){
        int sum =0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }
    
    public double getMean(int a){
        return a/100;
        
    }
    
}
