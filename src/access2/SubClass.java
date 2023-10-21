package access2;

import access.A;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {

       /*
        Doar subclasa poate accesa membrii protected din clasa de baza

        asa nu merge
        A obj = new A(45,"Anna");
        int n = obj.num;

        nici asa
        A obj = new SubClass(...);
        int n = obj.num;

        */

        SubClass obj = new SubClass(4,"sss");
        int n = obj.num;

    }
}


class SubSubClass extends SubClass{

    public SubSubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {

        // e o sub clasa a sub clasei deci poate accesa datele protected din clasa de baza
        SubSubClass obj = new SubSubClass(5,"aaa");
        int n = obj.num;
    }
}

