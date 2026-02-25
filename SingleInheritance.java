package Assessment1;

class Animal{
    int pows;
    Animal(int pows){
        this.pows=pows;
    }
}
 class Dog extends Animal{
    String colour;
    Dog(String colour, int pows){
        super(pows);
        this.colour=colour;
        
    }
    void display(){
        System.out.print("the dog is of "+colour+" colour and has "+pows+" pows");
    }
 }
public class SingleInheritance {
    public static void main(String[] args) {
        Dog d=new Dog("brown",4);
        d.display();

    }
    
}
