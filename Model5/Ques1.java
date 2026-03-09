package Assessment1.Model5;

import java.io.FileReader;

public class Ques1 {

    public static void main(String[] args) {

        // Checked Exception Example
        try {
            FileReader fileReader = new FileReader("sample.txt");
            System.out.println("File opened successfully");
        } catch (Exception error) {
            System.out.println("Checked Exception occurred: " + error);
        }

        // Unchecked Exception Example
        try {
            int studentMarks = 10;
            int numberOfSubjects = 0;

            int averageMarks = studentMarks / numberOfSubjects;
            System.out.println(averageMarks);
        } catch (ArithmeticException error) {
            System.out.println("Unchecked Exception occurred: Division by zero");
        }
    }
}