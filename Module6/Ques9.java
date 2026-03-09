package Assessment1.Module6;

public class Ques9 {
    public static void main(String[] args) {

        int[] numbers = {1,2,4,5};

        int n = 5;

        int expectedTotal = n * (n + 1) / 2;

        int actualTotal = 0;

        for(int num : numbers){
            actualTotal += num;
        }

        int missingValue = expectedTotal - actualTotal;

        System.out.println("Missing Number: " + missingValue);
    }
}
