import java.util.Arrays;
import java.util.Scanner;

public class Inputarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] arr=new String[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.next();
        }
        for(String j:arr){
            System.out.println(j+" ");
        }


        //Integer input
//        int[] arr = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " ");
//        }
        //for each
//        for (int j : arr) {// for every element in the array print the element
//            System.out.println(j + " ");
//        }

    }
}
