package collection_frame_work;
import java.util.*;
public class vector {
    public static void main(String[] args) {
//        vector are synchronized the object  will be wait
//        until one object works complete on vector it is slow when compare to array list
//        array list is fast is because it is non synchronized various object can access it

        List<Integer>vec =new Vector<>();
        vec.add(12);
        System.out.println(vec);
        List<Integer>vec1 =new Vector<>();
        vec1.add(23);
        System.out.println(vec1);


    }
}
