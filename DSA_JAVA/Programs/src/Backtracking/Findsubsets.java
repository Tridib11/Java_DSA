package Backtracking;

public class Findsubsets {
    public static void main(String[] args) {
        String s="abc";
//        find_subsets(s,"",0);
        find_subsets(s, new StringBuilder(), 0);

    }

//    static void find_subsets(String str,String ans,int i){
//        //base case
//        if(i==str.length()){
//            System.out.println(ans);
//            return;
//        }
//        //two choices
//        //yes
//        find_subsets(str,ans+str.charAt(i),i+1);
//        //no
//        find_subsets(str,ans,i+1);
//    }

    //Using String Builder
static void find_subsets(String str,StringBuilder ans,int i){
    //base case
    if(i==str.length()){
        System.out.println(ans);
        return;
    }
    //two choices
    //yes
    ans.append(str.charAt(i)); //add the character to the answer
    find_subsets(str,ans,i+1);
    ans.deleteCharAt(ans.length()-1); //remove the character from the answer
    //no
    find_subsets(str,ans,i+1);
     }
}



