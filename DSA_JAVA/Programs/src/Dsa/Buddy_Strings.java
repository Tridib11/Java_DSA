package Dsa;

import java.util.Arrays;

public class Buddy_Strings {
    public static void main(String[] args) {
//        String s="Hello world";
//        char[] ch=s.toCharArray();
//        System.out.println(Arrays.toString(ch));
        String s="ab";
        String goal="ab";
        System.out.println(buddyStrings(s,goal));

    }

    public static boolean buddyStrings(String s, String goal) {
        char[] sh=s.toCharArray();
        String concatenatedString = String.valueOf(sh[1]) + String.valueOf(sh[0]);

        if(s.length()!=goal.length()) {
            return false;
        }
//        else if(s.equals(goal)){
//            return false;
//        }
        else if(concatenatedString.equals(goal)){
            return true;
        }
        return false;
    }

}
