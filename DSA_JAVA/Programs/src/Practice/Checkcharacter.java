import java.util.Scanner;

public class Checkcharacter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the character  ");
        char ch=input.next().trim().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("The character is a lower case letter");
        }
        else if (ch>='A' && ch<='Z'){
            System.out.println("The character is a uppercase character");
        }
        else {
            System.out.println("None");
        }
    }
}
