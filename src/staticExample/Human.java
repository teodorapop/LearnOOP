package staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;

    // but what if there is a property that is common to every human ?
    // for example population

    static long population;

    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }

    static void message(){
        System.out.println("Hello world");
        //System.out.println(this.age); // you can't use this inside a static member
    }


}
