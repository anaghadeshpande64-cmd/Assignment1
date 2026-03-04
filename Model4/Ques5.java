
final class UniversityInfo {

   
    final String universityName = "Global Tech University";

    
    final void displayUniversity() {
        System.out.println("University Name: " + universityName);
    }
}

public class Ques5 {

    public static void main(String[] args) {

        final int studentAge = 21;   

        System.out.println("Student Age: " + studentAge);

        UniversityInfo university = new UniversityInfo();
        university.displayUniversity();

       
    }
}