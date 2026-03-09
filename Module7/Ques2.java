package Assessment1.Module7;

public class Ques2 {
    public static int findFirstOccurrence(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;
        int result = -1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (numbers[mid] == target) {
                result = mid;
                right = mid - 1;
            } 
            else if (numbers[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static int findLastOccurrence(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;
        int result = -1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (numbers[mid] == target) {
                result = mid;
                left = mid + 1;
                } 
            else if (numbers[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return result;
    }
    
}
