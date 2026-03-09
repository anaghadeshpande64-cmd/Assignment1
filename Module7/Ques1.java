package Assessment1.Module7;

public class Ques1 {
    public static int iterativeBinarySearch(int[] numbers, int targetValue) {

        int leftIndex = 0;
        int rightIndex = numbers.length - 1;

        while (leftIndex <= rightIndex) {

            int middleIndex = (leftIndex + rightIndex) / 2;

            if (numbers[middleIndex] == targetValue) {
                return middleIndex;
            }

            if (numbers[middleIndex] < targetValue) {
                leftIndex = middleIndex + 1;
            } else {
                rightIndex = middleIndex - 1;
            }
        }

        return -1;
    }

    public static int recursiveBinarySearch(int[] numbers, int leftIndex, int rightIndex, int targetValue) {

        if (leftIndex > rightIndex) {
            return -1;
        }

        int middleIndex = (leftIndex + rightIndex) / 2;

        if (numbers[middleIndex] == targetValue) {
            return middleIndex;
        }

        if (numbers[middleIndex] < targetValue) {
            return recursiveBinarySearch(numbers, middleIndex + 1, rightIndex, targetValue);
        }
        return recursiveBinarySearch(numbers, leftIndex, middleIndex - 1, targetValue);
    }

    public static void main(String[] args) {

        int[] numbers = {2,4,6,8,10,12};

        int targetValue = 8;

        System.out.println(iterativeBinarySearch(numbers, targetValue));
        System.out.println(recursiveBinarySearch(numbers, 0, numbers.length - 1, targetValue));
    }
    
}
