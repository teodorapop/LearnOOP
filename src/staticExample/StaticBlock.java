package staticExample;

public class StaticBlock {
    static int a = 4;
    static int b;

    // will only run once, when the first obj is created
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {

        StaticBlock obj = new StaticBlock();
        System.out.println(a + " " + b);

        b += 3;
        System.out.println(a + " " + b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(a + " " + b); // nu se mai apeleaza static block
    }
}
