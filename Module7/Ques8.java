package Assessment1.Module7;

public class Ques8 {
    public static void quickSort(int[] numbers, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(numbers, low, high);

            quickSort(numbers, low, pivotIndex - 1);
            quickSort(numbers, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] numbers, int low, int high) {

        int pivotValue = numbers[high];
        int smallerElementIndex = low - 1;

        for (int currentIndex = low; currentIndex < high; currentIndex++) {

            if (numbers[currentIndex] < pivotValue) {

                smallerElementIndex++;

                int temp = numbers[smallerElementIndex];
                numbers[smallerElementIndex] = numbers[currentIndex];
                numbers[currentIndex] = temp;
            }
        }

        int temp = numbers[smallerElementIndex + 1];
        numbers[smallerElementIndex + 1] = numbers[high];
        numbers[high] = temp;

        return smallerElementIndex + 1;
    }
    
}
