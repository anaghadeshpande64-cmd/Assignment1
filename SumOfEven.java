package Assessment1;

public class SumOfEven {
    public static void main(String[] args) {
        int sum=0;
        int n=1;
        while(n<=100){
            if(n%2==0){
                sum=sum+n;
            

            }
            n++;
        

        }
        System.out.println("the sum is= "+ sum);
    }
    
}
