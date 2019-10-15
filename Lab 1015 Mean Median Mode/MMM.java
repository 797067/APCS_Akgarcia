
/**
 * Mean Median Mode
 *https://stackoverflow.com/questions/4191687/how-to-calculate-mean-median-mode-and-range-from-a-set-of-numbers
 * @author (Kayla Garcia)
 * @version (1015)
 */
import java.util.ArrayList;
public class MMM

{ 
    
    ArrayList<Integer> nums = new ArrayList<Integer>();
    
    public static double getMean(double[] data){
        final double mean = getMean(data);
            double sum = 0;
            for (int index = 0; index != data.length; ++index) {
                sum += Math.pow(Math.abs(mean - data[index]), 2);
            }
            return Math.sqrt(sum / data.length);
    
    }
}
