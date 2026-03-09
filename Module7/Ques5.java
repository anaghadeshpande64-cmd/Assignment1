package Assessment1.Module7;

public class Ques5 {
    public static void selectionSort(int[] numbers) {

        for (int currentPosition = 0; currentPosition < numbers.length - 1; currentPosition++) {

            int smallestIndex = currentPosition;

            for (int nextIndex = currentPosition + 1; nextIndex < numbers.length; nextIndex++) {

                if (numbers[nextIndex] < numbers[smallestIndex]) {
                    smallestIndex = nextIndex;
                }
            }

            int temp = numbers[currentPosition];
            numbers[currentPosition] = numbers[smallestIndex];
            numbers[smallestIndex] = temp;
        }
    }
    
}
