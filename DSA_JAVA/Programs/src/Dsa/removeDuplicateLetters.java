package Dsa;

public class removeDuplicateLetters {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("cbacdcbc"));
    }
    static String removeDuplicates(String s){
        StringBuilder ans=new StringBuilder();
        boolean map[]=new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            if(map[s.charAt(i)-'a']==false){
                ans.append(s.charAt(i));
                map[s.charAt(i)-'a']=true;
            }
        }
        return ans.toString();
    }
}
