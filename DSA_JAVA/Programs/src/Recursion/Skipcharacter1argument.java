package Recursion;

public class Skipcharacter1argument {
    public static void main(String[] args) {
        System.out.println(skip("bcadaae"));
    }

    static String skip(String new_String){
        if(new_String.isEmpty()){
            return "";
        }
        char ch=new_String.charAt(0);
        if(ch=='a'){
            return skip(new_String.substring(1));
        }
        else {
            return ch+skip(new_String.substring(1));
        }
    }
}
