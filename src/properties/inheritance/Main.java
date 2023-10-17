package properties.inheritance;

public class Main {
    public static void main(String[] args) {

//        Box box = new Box();
//        System.out.println(box.l + " " + box.w + " " + box.h);
//
//        Box box1 = new Box(4.6, 7.9, 9.9);
//        System.out.println(box1.l + " " + box1.w + " " + box1.h);
//        Box box2 = new Box(box1);
//        System.out.println(box2.l + " " + box2.w + " " + box2.h);

        //I can't print Box box.weight because only child class have this attribute

        BoxWeight boxWeight = new BoxWeight();
        System.out.println(boxWeight.h + " "+ boxWeight.weight);




    }
}
