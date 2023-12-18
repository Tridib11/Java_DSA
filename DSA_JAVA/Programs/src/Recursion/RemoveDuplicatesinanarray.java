package Recursion;

public class RemoveDuplicatesinanarray {
    public static void main(String[] args) {
        String str="appnnacollege";
        removeDuplicates(str,0,new StringBuilder(""),new boolean[26]);
    }
    static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char curChar=str.charAt(idx);
        if(map[curChar-'a']==true){
            removeDuplicates(str,idx+1,newStr,map);
        }
        else{
            map[curChar-'a']=true;
            removeDuplicates(str,idx+1,newStr.append(curChar),map);
        }
    }
}
