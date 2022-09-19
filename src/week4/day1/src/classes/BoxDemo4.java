package classes;
class Boxx{
    double width;
    double height;
    double depth;

    //compute volume
    double volume(){
        return  width * height * depth;
    }
}
public class BoxDemo4 {

    public static void main(String[] args) {
        Boxx mybox1 = new Boxx();
        Boxx mybox2 = new Boxx();
        double vol;

        //assign vales to mybox1's instance variables
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        //assign diff values to mybox2's instance variables
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        //display volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is "+vol);
        vol = mybox2.volume();
        System.out.println("Volume is "+vol);
    }

}
