package Dsa;

public class Palindrome_String {
    public static void main(String[] args) {
        String s="";
        System.out.println(reversesheck(s));

    }
    static boolean reversesheck(String s){
        if(s==null || s.length()==0){
            return true;
        }
        s=s.toLowerCase();
        for (int i = 0; i < s.length()/2; i++) {
            char start=s.charAt(i);
            char end=s.charAt(s.length()-1-i);
            if(start!=end){
                return false;
            }
        }
        return true;

    }
}
