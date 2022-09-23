package methncls;
//Define an Inner class with for loop
class Outer1{
    int outer_x = 100;
    void test(){
        for(int i=0;i<10;i++){
            class Inner{
                void display(){
                    System.out.println("display outer_x = "+outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        outer.test();
    }
}
