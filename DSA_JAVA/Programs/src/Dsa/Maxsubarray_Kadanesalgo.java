package Dsa;

public class Maxsubarray_Kadanesalgo {
    public static void main(String[] args) {

    }
    static int kadanesalgo(int[] arr){
        int max_element=Integer.MIN_VALUE;
        int cursum=0;
        for (int i = 0; i < arr.length; i++) {
            cursum=Math.max(cursum+arr[i],arr[i]);
            max_element=Math.max(max_element,cursum);
        }
        return max_element;
    }
}
