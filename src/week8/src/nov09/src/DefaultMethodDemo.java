interface MyIF{
    //this is a normal interface method declaration.It does not define default implementation
    int getNumber();
    //this is default method.notice that it provides default implementation
    default String getString(){
        return "Default String";
    }
}

//Implement MyIF
class MyIFImp implements MyIF{
    //Only getNumber() defined by MyIF needs to be implemented.
    //getString() can be allowed to default.
    public int getNumber() {
        return 100;
    }
}

//use default method
class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();
        //Can call getNumber() because it is explicitly implemented by MyIFImp
        System.out.println(obj.getNumber());
        //can also call getString() because of default implementation
        System.out.println(obj.getString());
    }
}
