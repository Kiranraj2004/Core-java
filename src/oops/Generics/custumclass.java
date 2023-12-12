package oops.Generics;

import java.util.Arrays;
//in this we are going to build our own arraylist
public class custumclass <T>{
    private Object []data;
    private int defaultsize=10;

    private static int size=0;
    custumclass(){
        data=new Object[defaultsize];
    }
    void add(T value){
        if (isfull()){
            resize();
        }
        data[size++]=value;
    }

    private void resize() {
        Object []temp=new Object[2 * data.length];
        for (int i = 0; i <data.length ; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }
    private boolean isfull() {
        return size==data.length;
    }
    T get(int index){
        return (T)data[index];
    }
    void set(int index,T value){
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
     custumclass<Integer>list=new custumclass<>();
        list.add(10);
        list.add(19);
        System.out.println(list.get(0));
//        for (int i = 0; i <15 ; i++) {
//            list.add(2*i);
//        }
        System.out.println(list);
    }
}
