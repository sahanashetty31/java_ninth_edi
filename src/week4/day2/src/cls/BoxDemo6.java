package cls;
class Boxx{
    double width;
    double height;
    double depth;

    //This is the constructor of Box
    Boxx(){
        System.out.println("Constructing box");
        width = 10;
        height = 10;
        depth = 10;
    }
    //compute and return volume
    double volume(){
        return width*height*depth;
    }
}
public class BoxDemo6 {
    public static void main(String[] args) {
        //declare,allocate and initialize Boxx objects
        Boxx mybox1 = new Boxx();
        Boxx mybox2 = new Boxx();
        double vol;

        //get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is "+vol);

        //get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume is "+vol);
    }
}
