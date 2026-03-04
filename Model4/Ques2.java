package Assessment1.Model4;

interface Payment{
    void pay();
}
class CreditCardPayment implements Payment{
    public void pay(){
        System.out.println("Paying with credit card");
    }
}

class UPIPayment implements Payment{
    public void pay(){
        System.out.println("Paying with UPI");
    }
}
public class Ques2 {
    public static void main(String[] args) {
        CreditCardPayment c=new CreditCardPayment();
        UPIPayment p=new UPIPayment();
        c.pay();
        p.pay();
    }
    
}
