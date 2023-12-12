package oops.Generics;

import java.util.Arrays;

public class Creating_arraylist {
    private int []data;
    private int defaultsize=10;

    private static int size=0;
    Creating_arraylist(){
        data=new int[this.defaultsize];
    }
    void add(int value){
        if (isfull()){
            resize();
        }
        data[size++]=value;
    }

    private void resize() {
        int []temp=new int[2 * data.length];
        for (int i = 0; i <data.length ; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }
    private boolean isfull() {
        return size==data.length;
    }
    int get(int index){
        return data[index];
    }
    void set(int index,int value){
        data[index]=value;
    }
    void remove(){
        size--;
    }

    @Override
    public String toString() {
        return "Creating_arraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        Creating_arraylist list=new Creating_arraylist();
        list.add(10);
        list.add(12);
        System.out.println(list.get(0));
//        for (int i = 0; i <15 ; i++) {
//            list.add(2*i);
//        }
        System.out.println(list);
    }
}
