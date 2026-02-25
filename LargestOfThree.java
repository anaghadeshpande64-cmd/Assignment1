package Assessment1;

public class LargestOfThree {
    public static void main(String[] args) {
        int a=8, b=3, c=5;
        if(a>b){
            if(a>c){
                System.out.println(a+" is greater");
            }
            else{
                System.out.println(c+" is greater");
            }
        }
        else if(b>c){
            System.out.println(b+" is greatest");
        }
            else{
                System.out.println(c + " id greates");
            }
        
        

    }
}
