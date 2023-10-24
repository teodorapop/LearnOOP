package generics.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(12, 89.16f);
        Student student1 = new Student(5, 99.52f);
        Student student2 = new Student(7, 86.52f);
        Student student3 = new Student(19, 77.52f);

        Student[] list = {student, student1, student2, student3};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        if (student.compareTo(student1) < 0){
            System.out.println(student.compareTo(student1));
            System.out.println("The second student has more marks");
        }
    }
}
