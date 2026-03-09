package Assessment1.Model5;

public class Ques2 {

    public static void main(String[] args) {

        int totalScore = 50;
        int numberOfStudents = 0;

        try {
            int averageScore = totalScore / numberOfStudents;
            System.out.println("Average Score: " + averageScore);
        } catch (ArithmeticException error) {
            System.out.println("Error: Cannot divide by zero");
        } finally {
            System.out.println("Division operation attempted");
        }
    }
}
