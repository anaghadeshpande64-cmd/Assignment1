package Assessment1.Module6;

import java.util.HashMap;

public class Ques5 {
    public static void main(String[] args) {

        int[] numbers = {2,7,11,15};
        int target = 9;

        HashMap<Integer,Integer> storedNumbers = new HashMap<>();

        for(int currentIndex = 0; currentIndex < numbers.length; currentIndex++){

            int requiredValue = target - numbers[currentIndex];

            if(storedNumbers.containsKey(requiredValue)){
                System.out.println("Indices: " + storedNumbers.get(requiredValue) + " , " + currentIndex);
            }

            storedNumbers.put(numbers[currentIndex], currentIndex);
        }
    }
    
}
