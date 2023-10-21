package abstractDemo;

public abstract class Parent {

    int age;

    public Parent(int age) {
        this.age = age;
    }

    static void hello(){
        System.out.println("hello");
    }

    // this can be overrided in child class
    void normal(){
        System.out.println("hey");
    }

    abstract void career();

    abstract void partner();

}
