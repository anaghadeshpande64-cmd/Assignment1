package Assessment1.Module6;

public class Ques6 {
    public static void main(String[] args) {

        int[] numbers = {2,2,1,1,1,2,2};

        int possibleMajority = 0;
        int count = 0;

        for(int num : numbers){

            if(count == 0){
                possibleMajority = num;
            }

            if(num == possibleMajority){
                count++;
            }
            else{
                count--;
            }
        }

        System.out.println("Majority Element: " + possibleMajority);
    }
    
}
