package Assessment1.Module6;

public class Ques4 {
    
     public static void main(String[] args) {

        int[] numbers = {1,5,7,-1,5};
        int targetSum = 6;

        for(int firstIndex = 0; firstIndex < numbers.length; firstIndex++){

            for(int secondIndex = firstIndex + 1; secondIndex < numbers.length; secondIndex++){

                if(numbers[firstIndex] + numbers[secondIndex] == targetSum){
                    System.out.println(numbers[firstIndex] + " , " + numbers[secondIndex]);
                }
            }
        }
    }
}
