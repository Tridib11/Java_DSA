package Recursion;


import java.util.*;

class AmazonHacathon1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int key=sc.nextInt();
        System.out.println(encodedString(s,key));
    }
    public static String encodedString(String string,int integer){
        StringBuilder encodedString=new StringBuilder();
        for(char ch:string.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                integer+=2;
            }
            else{
                integer+=1;
            }
            encodedString.append(ord(ch)*integer).append(" ");
        }
        return encodedString.toString();
    }
    public static int ord(char ch){
        return (int)ch;
    }
}