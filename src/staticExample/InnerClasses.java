package staticExample;

// outside classes cannot be static

// static public InnerClasses{
//
//        }

public class InnerClasses {

    // it can work like that if this class is static
    class Test{

        // if name is static, the name will be the same for t1 and t2
        String name;

        public Test(String name){
            // Test.name = name;
            this.name = name;
        }
    }

    public static void main(String[] args) {

        // if Test class is not static
        // we need an instance of extern class
        InnerClasses i = new InnerClasses();
        Test t1 = i.new Test("Raul");
        Test t2 = i.new Test("Test");
        System.out.println(t1.name);
        System.out.println(t2.name);

        // if Test is static
        //Test a = new Test("Kunal");
    }




}
