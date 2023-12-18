import java.util.Scanner;

public class Count_Occurances {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int input=in.nextInt();
        System.out.println("Enter the number you want to find the occurances for ");
        int search=in.nextInt();
        int count=0;
        while(input>0){
            int remainder=input%10;
            if(remainder==search){
                count+=1;
            }
            input=input/10;
        }
        System.out.println(search+" appeared for "+count+" times");
    }
}
