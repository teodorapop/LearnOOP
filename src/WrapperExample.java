public class WrapperExample {
    public static void main(String[] args) {

        // int is a primitive datatype in JAVA
        int a = 10;
        int b = 20;

        // Integer is a wrapper class which encapsulates a primitive datatype
        // provides methods and functionalities
        Integer num = 5;

        // the numbers won't change because it's a primitive datatype
        // the "a" from swap is not the same with the declared "a", it's just a value
        swap1(a,b);
        System.out.println(a + " " + b);

        Integer c = 10;
        Integer d = 20;

        swap2(c,d);
        // still not working. It's because the class Integer is final
        System.out.println(c + " " + d);


        // how to solve this -> array
        Integer[] numbers = {10, 20};
        swap(numbers);
        System.out.println(numbers[0] + " " + numbers[1]); // Va afișa "20 10"

    }

    static void swap1(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static void swap2(Integer c, Integer d){
        int temp = c;
        c = d;
        d = temp;
    }

    static void swap(Integer[] arr) {
        if (arr.length >= 2) {
            Integer temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
    }
}
