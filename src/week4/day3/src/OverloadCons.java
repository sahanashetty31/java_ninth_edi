//here,box defines three constructors to intialize dimensions of various box types
class Box{
    double width;
    double height;
    double depth;

    //constructor used when all dimensions specified
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    //constructor used when no dimensions specified
    Box(){
        width = -1;  //used -1 to indicate unintialized box
        height = -1;
        depth = -1;
    }
    //constructor used when cube is created
    Box(double len){
        width = height = depth = len;
    }
    //compute and return volume
    double volume(){
        return  width*height*depth;
    }
}

public class OverloadCons {
    public static void main(String[] args) {
        //create Boxes using various constructors
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        double vol;

        //get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is "+vol);
        //get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is "+vol);
        //get volume of cube
        vol = mycube.volume();
        System.out.println("Volume of mybox2 is "+vol);


    }
}
