package Dsa;

public class Searchinstrings {
    public static void main(String[] args) {
        String name="help";
        char target='u';
        System.out.println(search2(name,target));
    }

    //Using foreach loop
    //to use for each loop we need a collection of something so converting the string to character array(.toCharArray())
    static boolean search2(String str,char target){
        if (str.length()==0){
            return false;
        }
        for(char ch:str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }

    //Using normal for loop
    static boolean search(String str,char target){
        if (str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
