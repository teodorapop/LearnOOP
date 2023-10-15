
public class Main {
    public static void main(String[] args) {

        // if I want to store 5 numbers

        int[] nr = {1,2,3,4,5};
        int[] numbers = new int[5];

        // or store 5 names

        String[] names = new String[5];

        // but what if I want to store 5 students ?
        // a Student must have: id, name, marks

        int[] id = new int[5];
        String[] name = new String[5];
        double[] marks = new double[5];

        // but these are only different datatype
        // I want to combine these properties into a single Entity: Student
        // that's why we need OOP

        Student student1; // this is declaring an object, NOT creating one

        // an object is creating using "new" keyword and constructor

        Student student2 = new Student();

        student2.id = 2;
        student2.name = "Bogdan";
        student2.marks = 9.8;

        System.out.println(student2.id);
        System.out.println(student2.name);
        System.out.println(student2.marks);

        student2.greeting();

        // we can add these 3 attributes in 1 line,
        // but we need a constructor with parameters

        Student student3 = new Student(3,"Andrei",7.6);

        System.out.println(student3.id);
        
        // egalez un student cu alt student
        Student random = new Student(student3);

    }

    // create a class
    static class Student{

        // template
        int id;
        String name;
        double marks;

        void greeting(){
            System.out.println("Hello, my name is " + this.name);
        }

        // default constructor
        Student (){
            this.id = 1;
            this.name = "Default name";
            this.marks = 0.0;
        }

        // constructor with parameters
        Student (int id, String name, Double marks){
            this.id = id;
            this.name = name;
            this.marks = marks;
        }

        // if I want to make 2 students equals
        Student (Student other){
            this.id = other.id;
            this.name = other.name;
            this.marks = other.marks;
        }

    }
}


