package properties.inheritance;

public class Main {
    public static void main(String[] args) {

        /*Box box = new Box();
        System.out.println(box.l + " " + box.w + " " + box.h);

        Box box1 = new Box(4.6, 7.9, 9.9);
        System.out.println(box1.l + " " + box1.w + " " + box1.h);
        Box box2 = new Box(box1);
        System.out.println(box2.l + " " + box2.w + " " + box2.h);*/

        //I can't print Box box.weight because only child class have this attribute

        /*BoxWeight boxWeight = new BoxWeight();
        System.out.println(boxWeight.h + " "+ boxWeight.weight);

        Box box3 = new BoxWeight(2,3,4,8);
        System.out.println(box3.h); // no problem with that*/
        //System.out.println(box3.weight); // but I can't access this

        // I can't have a child reference and a parent object
        // you should have access to weight variable
        // the object here is of type parent class, so how will you call the constructor?
        // error
        //BoxWeight box4 = new Box(2,3,4); // I can't do this

        BoxPrice box = new BoxPrice(5,8,200);

        //call the static method
        Box box2 = new Box();
        box2.greeting(); // this will work, but is static so does not require an object
        Box.greeting(); // correct way to call it

        // but what if I have a static method greeting() in the child class ?
        // the method from parent class will always run, no matter which object will call it
        Box box3 = new BoxWeight();
        box3.greeting(); // this will call the method in parent class !!!

        BoxWeight box4 = new BoxWeight();
        box4.greeting(); // static method in BoxWeight -> will call it
                         // no method -> will call the method in parent
        BoxWeight.greeting(); // same as above

        // SO YOU CAN "INHERIT", BUT YOU CANNOT OVERRIDE :)



    }
}
