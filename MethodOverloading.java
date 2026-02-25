class Shape{
    void calarea(double r){
        double area=3.14*r*r;
        System.out.println(area);

    }
    void calarea(double l,double b){
        double area=l*b;
        System.out.println(area);

    }
        
    
}
public class MethodOverloading{
    public static void main(String[] args) {
        Shape s1= new Shape();
        s1.calarea(3);
        s1.calarea(4, 3);
    }
}
