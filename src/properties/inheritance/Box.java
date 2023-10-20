package properties.inheritance;

public class Box {
    // these can't be private
    // we need to access this from child class
    double l;
    double h;
    double w;

    // default constructor
    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // cube
    Box(double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    // copy constructor
    Box(Box old){
        this.l=old.l;
        this.w=old.w;
        this.h=old.h;
    }

    public void information(){
        System.out.println("Running the box");
    }

    // what if we have a static method ?
    static void greeting(){
        System.out.println("Hey, I am in Box class, Greetings!");
    }


}
