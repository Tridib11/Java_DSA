package Recursion;

public class SkipStrings {
    public static void main(String[] args) {
        System.out.println(skip("bcdaapplehhg"));
    }
    static String skip(String new_String){
        if(new_String.isEmpty()){
            return "";
        }
        if(new_String.startsWith("apple")){
            return skip(new_String.substring(5));
        }
        else {
            return new_String.charAt(0)+skip(new_String.substring(1));
        }
    }
}
