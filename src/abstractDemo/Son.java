package abstractDemo;

public class Son extends Parent{

    public Son(int age) {
        super(age);
        //this.age = age; if I don't have a constructor in parent class
    }

    @Override
    void career() {
        System.out.println("I am going to be a doctor");

    }

    @Override
    void partner() {
        System.out.println("I love dogs");

    }
}
