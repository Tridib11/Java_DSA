import java.util.Scanner;

public class Switch_fruits {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String fruit=input.next();

        ///Normal Switch

//        switch (fruit){
//            case "Mango":
//                System.out.println("The king of fruit");
//                break;
//            case "Apple":
//                System.out.println("Healthy fruit");
//                break;
//            case "Banana":
//                System.out.println("Minions");
//                break;
//            default:
//                System.out.println("Please specify the fruits from Apple,Banana and Mango");


        /// Enhanced Switch

        switch (fruit) {
            case "Mango" -> System.out.println("The king of fruit");
            case "Apple" -> System.out.println("Healthy fruit");
            case "Banana" -> System.out.println("Minions");
            default -> System.out.println("Please specify the fruits from Apple,Banana and Mango");
        }

    }
}
