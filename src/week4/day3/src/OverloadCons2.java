

class Boxx{
    double width;
    double height;
    double depth;

    //notice this constructor.it takes an object of type Boxx
    Boxx(Boxx ob){// pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //constructor when all dimensions specified
    Boxx(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    //constructor used when no dimensions specified
    Boxx(){
        width = -1;
        height = -1;
        depth = -1;
    }

    //constructor used when cube is created
    Boxx(double len){
        width=height=depth=len;
    }

    //compute and return volume
    double volume(){
        return width*height*depth;
    }

}
public class OverloadCons2 {
    public static void main(String[] args) {
        //create boxes using various constructors
        Boxx mybox1 = new Boxx(10,20,15);
        Boxx mybox2 =new Boxx();
        Boxx mycube = new Boxx(7);
        Boxx myclone = new Boxx(mybox1);  //create copy of object
        double vol;

        //get volume of frst box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is "+vol);

        //get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is "+vol);

        //get volume of cube
        vol = mycube.volume();
        System.out.println("Volume of mybcube is "+vol);

        //get volume of clone
        vol = myclone.volume();
        System.out.println("Volume of myclone is "+vol);

    }
}
