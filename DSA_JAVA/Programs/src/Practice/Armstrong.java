import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        String s = Integer.toString(num);
        int length=s.length();
//        System.out.println(length);
        int temp=num;
        int sum=0;
        int d;
        while(num!=0){
            d=num%10;
            sum += Math.pow(d, length);
            num=num/10;
        }
        if (sum==temp){
            System.out.println("It is an Armstrong number");
        }
        else {
            System.out.println("It is not an Armstrong number");
        }
    }
}
