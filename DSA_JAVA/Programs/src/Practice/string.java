import java.util.Arrays;
import java.util.Objects;

public class string {
    public static void main(String[] args) {
        int[] arr={2,3,5,4,19};
//        Integer[] arr1={3,4,1,0};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        int nuim=10;
        Object name_object=32;
        System.out.println(name_object);
        String a="Tridib";
        String b="Tridib";
        System.out.println(a==b);
        int arr3[]=new int[10];


        String name=new String("Tridib");
        String name1=new String("Tridib");
        System.out.println(name1==name);
        //== checks if the reference variavbles are pointing to tha same object
//        Integer num=new Integer(12);
//        Integer num1=new Integer(12);
//        System.out.println(num==num1);
///.equals doesnot care if the refernce variables are pointing to the same objecvt
        System.out.println(name.equals(name1));
        System.out.println(name.charAt(0));
    }

}
