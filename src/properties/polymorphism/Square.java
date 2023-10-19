package properties.polymorphism;

public class Square extends Shapes {


    // this will run when obj of Square is created
    // it is overriding the parent method

    @Override
    void area(){
        System.out.println("Area is square of side");
    }
}
