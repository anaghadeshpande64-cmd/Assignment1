package Assessment1.Module6;

public class Ques7 {
    public static void main(String[] args) {

        int[] numbers = {3,-2,-5,6,-1,4};

        int left = 0;
        int right = numbers.length - 1;

        while(left < right){

            if(numbers[left] < 0){
                left++;
            }
            else if(numbers[right] > 0){
                right--;
            }
            else{
                int temp = numbers[left];
                numbers[left] = numbers[right];
                numbers[right] = temp;

                left++;
                right--;
            }
        }

        for(int num : numbers){
            System.out.print(num + " ");
        }
    }
    
}
