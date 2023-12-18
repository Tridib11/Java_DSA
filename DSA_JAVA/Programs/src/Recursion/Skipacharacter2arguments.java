package Recursion;

public class Skipacharacter2arguments {
    public static void main(String[] args) {

        skip("","baccdah");
    }
    static void skip(String new_String,String previous_String){
        if(previous_String.isEmpty()){
            System.out.println(new_String);
            return;
        }
        char ch=previous_String.charAt(0);
        if(ch=='a'){
            skip(new_String,previous_String.substring(1));
        }
        else{
            skip(new_String+ch,previous_String.substring(1));
        }
    }
}
