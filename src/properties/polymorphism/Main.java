package properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        shape.area();
        circle.area();
        square.area();

        // ref type should be parent type
        // but the called method will be in obj type (child)
        // s.n. UPCASTING
        Shapes circle1 = new Circle();
        circle.area(); // it is a circle

    }
}
