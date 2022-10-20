package inheritance;

class AA{
    void callme(){
        System.out.println("Inside AA's callme method");
    }
}

class BB extends  AA{
    //override callme()


    void callme() {
        System.out.println("Inside BB's callme method");
    }
}

class CC extends AA{
    void callme(){
        System.out.println("Inside CC's callme method");
    }
}
public class Dispatch {
    public static void main(String[] args) {
        AA a = new AA(); //object of type AA
        BB b = new BB();
        CC c = new CC();
        AA r; //obtain a arefernce of type AA
        r = a; //r refers to an object
        r.callme(); //calls AA's version of callme
        r = b; //refers to BB's object
        r.callme(); //calls BB's version of callme
        r=c; //refers to CC's object
        r.callme(); //calls CC's version of callme
    }
}
