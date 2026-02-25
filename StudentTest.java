package Assessment1;

class Student {

    int id;
    String name;

    
    Student() {
        id = 0;
        name = "Unknown";
       
    }

    
    Student(int i, String n) {
        id = i;
        name = n;
      
    }

    
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println();
    }
}

public class StudentTest {
    public static void main(String[] args) {        
        Student s1 = new Student();
        s1.display();
        Student s2 = new Student(101, "Anagha");
        s2.display();
    }
}