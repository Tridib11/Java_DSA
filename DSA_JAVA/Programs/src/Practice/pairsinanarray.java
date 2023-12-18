public class pairsinanarray {
    public static void main(String[] args) {
        int number[] ={2,4,6,8,10};
        printpairs(number);
    }
    static void printpairs(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int curr=arr[i];
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+curr+","+arr[j]+")");
            }
            System.out.println();
        }
    }
}
