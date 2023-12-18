public class Max_subarray {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        max(arr);
    }
    static void max(int[] arr)
    {
        int maxsum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int curentsum=0;
                for (int k = i; k <=j ; k++) {
                    curentsum+=arr[k];
                }
                System.out.println(curentsum);
                if(curentsum>maxsum){
                    maxsum=curentsum;
                }
            }
        }
        System.out.println(maxsum);
    }
}
