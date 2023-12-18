package Recursion;

public class BinaryStrings {
    public static void main(String[] args) {
        binaryStrings(4,0,"");
    }
    static void binaryStrings(int n,int lastplace,String str){
        int count=0;
        if(n==0){
            System.out.println(str);
            return;
        }
        binaryStrings(n-1,0,str+"0");
        if(lastplace==0){
            binaryStrings(n-1,1,str+"1");
        }

    }
}
