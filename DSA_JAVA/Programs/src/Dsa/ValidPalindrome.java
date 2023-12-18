package Dsa;

public class ValidPalindrome {
    public static void main(String[] args) {

    }

    static boolean addValues(String str){
        str=str.toLowerCase();
        StringBuilder b=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))|| Character.isLetter(str.charAt(i))){
                b.append(str.charAt(i));
            }
        }
        int check=palin(b);
        if(check==1){
            return true;
        }
        else {
            return false;
        }
    }
    static int palin(StringBuilder str){
        for (int i = 0; i < str.length()/2; i++) {
            char start=str.charAt(i);
            char end=str.charAt(str.length()-i-1);
            if(start!=end){
                return 0;
            }
        }
        return 1;
    }
}
