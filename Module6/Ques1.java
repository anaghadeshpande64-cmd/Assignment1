class Ques1 {

    public static void main(String[] args) {

        int[] numbers = {-2,1,-3,4,-1,2,1,-5,4};

        int currentSum = 0;
        int maxSumFound = Integer.MIN_VALUE;

        for(int value : numbers){

            currentSum = currentSum + value;

            if(currentSum > maxSumFound){
                maxSumFound = currentSum;
            }

            if(currentSum < 0){
                currentSum = 0;
            }
        }

        System.out.println("Maximum Subarray Sum: " + maxSumFound);
    }
}