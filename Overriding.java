//package Assessment1;

class Shape{
    void calArea(){
        System.out.print("Area not defined");
    }
    
}

class circle extends Shape{
    double radius;
    circle(double radius){
        this.radius=radius;
    }
    void calArea(){
        double area=3.14*radius*radius;
        System.out.println("Area of circle is "+area);

    }
}

class rectangle extends Shape{
    double lenght;
    double breadth;
    rectangle(double lenght, double breadth){
        this.lenght=lenght;
        this.breadth=breadth;
    }
    void calArea(){
        double area=lenght*breadth;
        System.out.println("Area of rectangle is "+area);

    }
}

public class Overriding{
    public static void main(String[] args) {
        Shape s1=new circle(5);
        Shape s2=new rectangle(5,5);
        
    }
}
