package Recursion;
//
//public class powerofxandnoptimised {
//    public static void main(String[] args) {
//
//    }
//    static int power(int x,int n){
//        if(n==0){
//            return 1;
//        }
//        int half_Of_The_Value_Of_X=power(x,n/2);
//        int multiply=half_Of_The_Value_Of_X*half_Of_The_Value_Of_X;
//        if(n%2==1){
//            multiply=x*multiply;
//        }
//        return multiply;
//    }
//}


class powerofxandnoptimised {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        if (n == Integer.MIN_VALUE) {
            x = x * x;
            n = n / 2;
        }

        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        return power(x, n);
    }

    private double power(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        double halfOfTheValueOfX = power(x, n / 2);
        double multiply = halfOfTheValueOfX * halfOfTheValueOfX;

        if (n % 2 == 1) {
            multiply *= x;
        }

        return multiply;
    }
}
