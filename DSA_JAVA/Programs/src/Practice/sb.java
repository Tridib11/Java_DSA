import java.util.Scanner;

public class sb {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        StringBuilder builder=new StringBuilder();
//        for (int i = 0; i < 26; i++) {
//            char ch=(char) ('a'+i);
//            builder.append(ch);
//        }
//        System.out.println(builder);
//        builder.deleteCharAt(0);
//        System.out.println(builder);


        // reverse a string using string builder

        String s= sc.nextLine();
        StringBuilder builder=new StringBuilder(s);
        builder.reverse();
        System.out.println(builder);


    }
}
