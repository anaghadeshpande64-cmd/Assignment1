package Assessment1.Module7;

public class Ques4 {
    public static void bubbleSort(int[] numbers) {

        int size = numbers.length;

        for (int pass = 0; pass < size - 1; pass++) {

            for (int index = 0; index < size - pass - 1; index++) {

                if (numbers[index] > numbers[index + 1]) {

                    int temp = numbers[index];
                    numbers[index] = numbers[index + 1];
                    numbers[index + 1] = temp;
                }
            }
        }
    }
    
}
