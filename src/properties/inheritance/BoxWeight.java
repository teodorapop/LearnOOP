package properties.inheritance;

public class BoxWeight extends Box {

    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        // call the constructor from Box (parent class)
        super(l, h, w); // if I don't write this will call the default constructor from parent class !!!
        this.weight = weight;
    }

    BoxWeight (double side, double weight){
        super(side);
        this.weight = weight;
    }


    BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }

    static void greeting(){
        System.out.println("Hey, I am in BoxWeight class, Greetings!");
    }



}
