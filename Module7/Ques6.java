package Assessment1.Module7;

public class Ques6 {
    public static void insertionSort(int[] numbers) {

        for (int currentIndex = 1; currentIndex < numbers.length; currentIndex++) {

            int currentValue = numbers[currentIndex];
            int previousIndex = currentIndex - 1;

            while (previousIndex >= 0 && numbers[previousIndex] > currentValue) {

                numbers[previousIndex + 1] = numbers[previousIndex];
                previousIndex--;
            }

            numbers[previousIndex + 1] = currentValue;
        }
    }
    
}
