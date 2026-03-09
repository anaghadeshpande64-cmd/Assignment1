package Assessment1.Model5;

public public class Ques4 {

    static void checkVotingEligibility(int personAge) {

        if (personAge < 18) {
            throw new ArithmeticException("Person is not eligible to vote");
        } else {
            System.out.println("Person is eligible to vote");
        }
    }

    public static void main(String[] args) {

        checkVotingEligibility(16);
    }
} {
    
}
