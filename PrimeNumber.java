package Assessment1;

public class PrimeNumber {
    public static void main(String[] args) {

        int number = 29; 
        int i = 2;
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            while (i < number) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime number");
        } else {
            System.out.println(number + " is not a Prime number");
        }
    }
}