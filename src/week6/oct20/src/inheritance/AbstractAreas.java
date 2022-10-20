
//using abstract methods and classes
package inheritance;
abstract class Figure1{
    double dim1;
    double dim2;
    Figure1(double a, double b){
        dim1 = a;
        dim2 = b;
    }
    //area is now an abstract method
    abstract double area();
}

class Rectangle1 extends Figure1{
    Rectangle1(double a, double b){
        super(a,b);
    }

    //override area of rectangle
    double area(){
        System.out.println("Inside Area of Rectangle");
        return dim1*dim2;
    }
}

class Triangle1 extends Figure{
    Triangle1(double a, double b){
        super(a,b);
    }
    //override area for right triangle
    double area(){
        System.out.println("Inside Area for Triangle");
        return dim1*dim2/2;
    }
}
public class AbstractAreas {
    public static void main(String[] args) {
        Figure1 f = new Figure(10,10); //illegal now
        Rectangle1 r = new Rectangle1(9,5);
        Triangle1 t = new Triangle1(10,8);
        Figure figref; //this is Ok, but no object is created
        figref = r;
        System.out.println("Area is: "+figref.area());
        figref = t;
        System.out.println("Area is: "+figref.area());
        figref = f;
        System.out.println("Area is: "+figref.area());
    }
}
