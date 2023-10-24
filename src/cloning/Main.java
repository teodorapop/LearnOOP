package cloning;

import interfaces.extendInterface.B;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Human Bogdan = new Human(34,"Bogdan");

//        Human twin = new Human(Bogdan);
//        System.out.println(twin.age);
//        System.out.println(twin.name);

        // cloning = creating the exact copy of a Human

        Human twin2= (Human)Bogdan.clone();
        System.out.println(twin2.age);
        System.out.println(twin2.name);
        System.out.println(Arrays.toString(twin2.arr));

        twin2.arr[0] = 100;

        System.out.println(Arrays.toString(twin2.arr));
        System.out.println(Arrays.toString(Bogdan.arr)); // if this is also changed, SHALLOW COPY (non-primitives)

        // I can prevent that with DeepCopy



    }
}
