package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenArrayList<T> {

    // if we want to type T to be restricted
    // public class CustomGenArrayList<T extends Numbers> # WILDCARD

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // aka index value (not total size of the array)


    public CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(this.isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove(){
        // size -- so will override the previous position
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index){
        return (T)(data[index]);
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString(){
        return "CustomArrayList { " +
                "data = " + Arrays.toString(data) +
                ", size = " + size +
                " }";
    }

    public static void main(String[] args) {


//        ArrayList list = new ArrayList();
        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.add(4);
        list.add(9);


        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add("adeasfesa");

        CustomGenArrayList<Integer> list3 = new CustomGenArrayList<>();
        for (int i = 0; i < 14; i++) {
            list3.add( 2 * i );

            System.out.println(list3);
        }


    }
}

