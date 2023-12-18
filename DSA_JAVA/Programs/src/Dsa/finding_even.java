package Dsa;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class finding_even {
    public static void main(String[] args) {
        int[] nums={12,645,2,6,7896};
        System.out.println(numbers(nums));

    }
    static int numbers(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

     static boolean even(int num) {
        int number=digits(num);
        return number%2==0;
    }
    static int digits(int num){
        int numberofdigits=0;
        if(num<0){
            num=num*-1;
        }
        while(num>0){
            numberofdigits++;
            num=num/10;
        }
        return numberofdigits;
    }


}
