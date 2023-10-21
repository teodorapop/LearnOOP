package abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(34);
        son.career();

        Daughter daughter = new Daughter(17);
        daughter.career();

        // Parent mom = new Parent(); you can't call the constructor
        // you cannot create object of abstract classes !

        Parent.hello();

        son.normal();
    }
}
