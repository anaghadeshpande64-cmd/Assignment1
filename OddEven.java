package Assessment1;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value of n");
         int n=s.nextInt();
         if(n==0)
            System.out.println("number is zero");
        else if(n%2==0)
            System.out.println("NUmber is even");
        else
            System.out.println("number is odd");
        
        
    }
    
}
