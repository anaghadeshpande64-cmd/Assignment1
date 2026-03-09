package Assessment1.Module6;

public class Ques2 {
    public static void main(String[] args) {

        int[] inputNumbers = {2,4,6,8,10};

        int[] prefixSum = new int[inputNumbers.length];

        prefixSum[0] = inputNumbers[0];

        for(int index = 1; index < inputNumbers.length; index++){
            prefixSum[index] = prefixSum[index-1] + inputNumbers[index];
        }

        int startIndex = 1;
        int endIndex = 3;

        int rangeSum;

        if(startIndex == 0){
            rangeSum = prefixSum[endIndex];
        }
        else{
            rangeSum = prefixSum[endIndex] - prefixSum[startIndex-1];
        }

        System.out.println("Range Sum = " + rangeSum);
    }
    
}
