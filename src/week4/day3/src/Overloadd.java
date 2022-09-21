
class OverloadDemoo{
    void test(){
        System.out.println("No parametres");
    }
    //overload test for two paramters
    void test(int a, int b){
        System.out.println("a and b: " + a +" " + b);
    }
    //overload test for double parameter
    void test(double a){
        System.out.println("Inside test(double)a: "+a);
    }
}
public class Overloadd {
    public static void main(String[] args) {
        OverloadDemoo ob1 = new OverloadDemoo();
        int i = 88;
        ob1.test();
        ob1.test(10,20);
        ob1.test(i); //this will invoke test(double)
        ob1.test(123.2);  //this will invoke test(double)
    }
}
