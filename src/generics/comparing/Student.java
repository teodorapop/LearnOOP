package generics.comparing;

public class Student implements Comparable<Student>{

    int id;
    float marks;

    public Student(int id, float marks) {
        this.id = id;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);

        // diff = 0: both are equal
        // < 0: o is bigger else o is smaller
        return diff;
    }

    @Override
    public String toString(){
        return marks + " " + id;
    }
}
