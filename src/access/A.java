package access;

public class A {
//    private int num;
    protected int num;
    String name;
    int[] arr;

    public int getNum(){
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }


}
