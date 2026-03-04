class Bank{
    int balance=2000;
    void withdraw(int amt){
        balance-=amt;
    }
}
class SBI extends Bank{
    void withdraw(int amt){
        balance-=(amt+10);
        System.out.println(balance);
    }
}

public class Overriding {
    public static void main(String[] args) {
        SBI s=new SBI();
        s.withdraw(500);
    }
    
}
