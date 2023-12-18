import java.util.Scanner;

public class Nth_Fibonacci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter what number you want the nth number for");
        int input=in.nextInt();
        int previousIndex=0;
        int currentIndex=1;
        int count=2;
        while(count<=input){
            int temp=currentIndex;
            currentIndex=currentIndex+previousIndex;
            previousIndex=temp;
            count++;
        }
        System.out.println(currentIndex);
    }
}
