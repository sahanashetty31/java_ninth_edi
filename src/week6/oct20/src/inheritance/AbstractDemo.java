//a smple demo of abstract
package inheritance;

abstract class One{
    abstract void callme();
    //concrete methods are still allowed in abstract class
    void callmetoo(){
        System.out.println("This is a concrete method");
    }
}

class Two extends One{
    void callme(){
        System.out.println("two's implementation of callme");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        Two tt = new Two();
        tt.callme();
        tt.callmetoo();
    }

}
