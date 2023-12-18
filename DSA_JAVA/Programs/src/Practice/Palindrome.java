import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=in.nextInt();
        int temp=num;
        int sum=0;
        int d;
        while(num!=0){
            d=num%10;
            sum=sum*10+d;
            num=num/10;
        }
        if(temp==sum){
            System.out.println("The number is palindrome ");
        }
        else{
            System.out.println("The number is not palindrome");
        }
    }
}
