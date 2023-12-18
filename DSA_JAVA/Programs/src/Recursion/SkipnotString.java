package Recursion;

public class SkipnotString {
    public static void main(String[] args) {
        System.out.println(skip("bcdaapphhg"));
    }
    //it is designed to skip app when it is not apple
    static String skip(String new_String){
        if(new_String.isEmpty()){
            return "";
        }
        if(new_String.startsWith("app") && !new_String.startsWith("apple")){
            return skip(new_String.substring(3));
        }
        else {
            return new_String.charAt(0)+skip(new_String.substring(1));
        }
    }
}
