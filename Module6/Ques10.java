package Assessment1.Module6;

public class Ques10 {
     public static void main(String[] args) {

        int[] numbers = {3,6,12,1,5,8};

        int evenPosition = 0;
        int oddPosition = 1;

        while(evenPosition < numbers.length && oddPosition < numbers.length){

            if(numbers[evenPosition] % 2 == 0){
                evenPosition += 2;
            }
            else if(numbers[oddPosition] % 2 == 1){
                oddPosition += 2;
            }
            else{
                int temp = numbers[evenPosition];
                numbers[evenPosition] = numbers[oddPosition];
                numbers[oddPosition] = temp;
            }
        }

        for(int num : numbers){
            System.out.print(num + " ");
        }
    }
}
