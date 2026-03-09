package Assessment1.Model5;

class InvalidSalaryException extends Exception {

    InvalidSalaryException(String message) {
        super(message);
    }
}

public class Ques3 {

    static void checkSalary(int employeeSalary) throws InvalidSalaryException {

        if (employeeSalary < 10000) {
            throw new InvalidSalaryException("Salary is below minimum limit");
        } else {
            System.out.println("Salary is valid");
        }
    }

    public static void main(String[] args) {

        try {
            checkSalary(8000);
        } catch (InvalidSalaryException error) {
            System.out.println(error.getMessage());
        }
    }
}
