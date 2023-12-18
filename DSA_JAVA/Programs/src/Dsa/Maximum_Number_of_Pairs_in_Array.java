package Dsa;

public interface Maximum_Number_of_Pairs_in_Array {
    public static void main(String[] args) {

    }
    static int[] check(int[] arr){

        int f[]=new int[101];
        for(int num:arr){
            f[num]++;
        }
        int pairs=0;
        for (int i = 0; i < 101; i++) {
            pairs+=f[i]/2;
        }
        return new int[]{pairs,arr.length-2*pairs};
    }
}
