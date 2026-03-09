package Assessment1.Module7;

public class Ques3 {
     public static int searchElement(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (numbers[mid] == target) {
                return mid;
            }

            if (numbers[left] <= numbers[mid]) {

                if (target >= numbers[left] && target < numbers[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            } else {

                if (target > numbers[mid] && target <= numbers[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
    
}
