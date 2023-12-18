package Recursion;

import java.util.ArrayList;

public class Arrayliststringsubseq {
    public static void main(String[] args) {
        System.out.println(subseqRet("","abc"));
    }
    static boolean isSubseq(String s,String t){
        ArrayList<String> list=subseqRet("",t);
        for (String subseq : list) {
            if (subseq.equals(s)) {
                return true; // If you find a match, return true.
            }
        }
        return false;
    }
    static ArrayList<String> subseqRet(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subseqRet(p+ch,up.substring(1));
        ArrayList<String> right=subseqRet(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
