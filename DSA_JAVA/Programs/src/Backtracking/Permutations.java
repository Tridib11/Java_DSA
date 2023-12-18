package Backtracking;

public class Permutations {
    public static void main(String[] args) {
        permutations("eidbaooo","");
    }
    static void permutations(String str,String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            String NewString=str.substring(0,i)+str.substring(i+1);
            permutations(NewString,ans+ch);
        }
    }
}
