package Dsa;
//https://leetcode.com/problems/sqrtx/description/
public class Sqrt_x {
    public static void main(String[] args) {

    }
    static int mysqrt(int x){
        long start=0;
        long end=x;
        long ans=-1;
        while(start<=end){
            long mid=start+(end-start)/2;
            long sqr=mid*mid;
            if(sqr==x){
                return (int)mid;
            }
            else if(sqr<x){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return (int)ans;
    }
}
