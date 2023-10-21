package access;

public class ObjectDemo {

    // class Object methods

    int num;
    float grade;

    public ObjectDemo(int num, float grade){
        this.num = num;
        this.grade = grade;
    }

    // gives a number representation of an object.
    // IT IS NOT THE ADDRESS !
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // gives the string representation
    @Override
    public String toString() {
        return super.toString();
    }

    // called when garbage collector hits
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {

        ObjectDemo obj = new ObjectDemo(34, 44.5f);
        System.out.println(obj.hashCode());

        ObjectDemo obj1 = new ObjectDemo(12, 78.9f);
        ObjectDemo obj2 = new ObjectDemo(12, 78.9f);


        // this verifies if the 2 obj are pointing to the same object
        if( obj1 == obj2 ){
            System.out.println("obj1 is equal to obj2");
        }

        // now it is checking the num value
        if(obj1.equals(obj2)){
            System.out.println("obj1 is equal to obj2");
        }

        System.out.println(obj1.getClass());

    }
}
