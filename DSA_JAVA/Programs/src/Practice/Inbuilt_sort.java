import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Inbuilt_sort {
    public static void main(String[] args) {

        //int[] arr={5,4,1,2,3};
        Integer[] arr={5,4,1,2,3};
        //Arrays.sort(arr);
//        Arrays.sort(arr,0,3);
//        Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr,0,3, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }


}
