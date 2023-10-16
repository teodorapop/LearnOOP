package staticExample;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(22, "Kunal", 1000, false);
        Human raul = new Human(34, "Raul", 4000, true);

        System.out.println(Human.population);
        System.out.println(Human.population);

        //inside a static method I can only call static methods ( without creating an object )
        greeting2();

        // but if I create a main object this will work
        Main main = new Main();
        main.greeting1();

    }

    // we know something that is not static belongs to an object
    void greeting1(){
        System.out.println("Hello ^.^");
     }

    static void greeting2(){
        System.out.println("hi :)");
    }
}
