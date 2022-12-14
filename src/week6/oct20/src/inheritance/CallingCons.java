//Demonstrate when constructors are executed
package inheritance;
//Create a super class
class A{
    A(){
        System.out.println("Inside A's constructor.");
    }
}

//create a subclass by extending A
class B extends A{
    B(){
        System.out.println("Inside B's constructor");
    }
}

//create another subclass by extending B
class C extends B{
    C(){
        System.out.println("Inside C's constructor");
    }
}

public class CallingCons {
    public static void main(String[] args) {
        C c = new C();
    }
}
