//Returning an object
class Tesst{
    int a;

    Tesst(int i){
        a = i;
    }
    Tesst incrByTen(){
        Tesst temp = new Tesst(a+10);
        return  temp;
    }
}
public class RetOb {
    public static void main(String[] args) {
        Tesst ob1 = new Tesst(2);
        Tesst ob2;
        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: "+ob1.a);
        System.out.println("ob2.a: "+ob2.a);
        ob2 = ob2.incrByTen();
        System.out.println("ob2.a after second increase: "+ob2.a);
    }
}
