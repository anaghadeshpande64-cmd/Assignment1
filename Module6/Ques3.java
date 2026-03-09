package Assessment1.Module6;

public class Ques3 {
    public static void main(String[] args) {

        int[] originalNumbers = {10,20,30,40,50};

        int[] diffArray = new int[originalNumbers.length];

        diffArray[0] = originalNumbers[0];

        for(int i=1;i<originalNumbers.length;i++){
            diffArray[i] = originalNumbers[i] - originalNumbers[i-1];
        }

        int updateStart = 1;
        int updateEnd = 3;
        int valueToAdd = 5;

        diffArray[updateStart] += valueToAdd;

        if(updateEnd + 1 < diffArray.length){
            diffArray[updateEnd + 1] -= valueToAdd;
        }

        int[] updatedNumbers = new int[originalNumbers.length];

        updatedNumbers[0] = diffArray[0];

        for(int i=1;i<updatedNumbers.length;i++){
            updatedNumbers[i] = updatedNumbers[i-1] + diffArray[i];
        }

        for(int num : updatedNumbers){
            System.out.print(num + " ");
        }
    }
    
}
