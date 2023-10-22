package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // aka index value not total size of the array


        public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
            if(this.isFull()){
                resize();
            }
            data[size++] = num;
    }

    private void resize() {
            int[] temp = new int[data.length * 2];

            // copy the current items in the new array
            for (int i = 0; i < data.length; i++){
                temp[i] = data[i];
            }
            data = temp;
    }

    private boolean isFull() {
            return size == data.length;
    }

    public int remove(){
            // size -- so will override the previous position
            int removed = data[--size];
            return removed;
    }

    public int get(int index){
            return data[index];
    }

    public int size(){
            return size;
    }

    public void set(int index, int value){
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


    }
}
