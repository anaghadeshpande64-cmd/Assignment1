package Assessment1.Module6;
import java.util.HashMap;

public class Ques8 {
    public static void main(String[] args) {

        int[] numbers = {1,-1,5,-2,3};
        int targetSum = 3;

        HashMap<Integer,Integer> prefixIndexMap = new HashMap<>();

        int runningSum = 0;
        int maxLength = 0;

        for(int i=0;i<numbers.length;i++){

            runningSum += numbers[i];

            if(runningSum == targetSum){
                maxLength = i + 1;
            }

            if(prefixIndexMap.containsKey(runningSum - targetSum)){
                maxLength = Math.max(maxLength, i - prefixIndexMap.get(runningSum - targetSum));
            }

            if(!prefixIndexMap.containsKey(runningSum)){
                prefixIndexMap.put(runningSum, i);
            }
        }

        System.out.println("Longest Length: " + maxLength);
    }
    
}
