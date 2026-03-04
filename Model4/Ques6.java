package Assessment1.Model4;


class Student {

    String studentName;
    int studentRollNumber;

    static String collegeName = "City Engineering College"; // static variable

    Student(String name, int rollNumber) {
        studentName = name;
        studentRollNumber = rollNumber;
    }

    static void displayCollegeName() {   // static method
        System.out.println("College Name: " + collegeName);
    }

    void displayStudentDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + studentRollNumber);
        System.out.println("College: " + collegeName);
        System.out.println();
    }
}

public class Ques6 {

    public static void main(String[] args) {

        Student studentOne = new Student("Ananya", 101);
        Student studentTwo = new Student("Rahul", 102);

        Student.displayCollegeName();

        studentOne.displayStudentDetails();
        studentTwo.displayStudentDetails();
    }
}