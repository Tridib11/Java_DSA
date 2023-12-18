import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
//        int ans = sum();
        String message=greet();

        System.out.println(message);

    }

    //    static  void sum(){
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter the number");
//        int num1=input.nextInt();
//        System.out.println("Enter the second number");
//        int num2=input.nextInt();
//        int sum=num1+num2;
//        System.out.println(sum);
//    }
    static int sum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = input.nextInt();
        System.out.println("Enter the second number");
        int num2 = input.nextInt();
//        int sum = num1 + num2;
        return num1+num2;
    }
    static String greet(){
        String greeting ="How are you";
        return greeting;
    }
}


