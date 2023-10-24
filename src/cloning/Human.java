package cloning;

// the interface does not have any abstract methods, so why we implement it?
// it is a way to tell the JVM that we are using clone in the Object of type Human

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name){
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,4,5,6,9,1};
    }

    public Human(Human other){
        this.age = other.age;
        this.name = other.name;
    }

    public Object clone() throws CloneNotSupportedException{
        // this is shallow copy
        //return super.clone();

        // this is deep copy
        Human twin = (Human) super.clone(); // this is actually shallow copy

        // make a deep copy

        twin.arr = new int[twin.arr.length]; // is creating now a new array
        for (int i = 0; i < twin.arr.length; i++){
            twin.arr[i] = this.arr[i];
        }
        return twin;

    }

}
