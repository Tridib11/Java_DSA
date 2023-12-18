package Patterns;
public class Numberdiamond {
    public static void main(String[] args) {
        for (int row = 1; row <=2*5; row++) {
            int maxStars = row <= 5 ? row : 2 * 5 - row;
            for (int i = 0; i <5-maxStars; i++) {
                System.out.print(" ");
            }
            for (int col =maxStars ; col >=1 ; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <=maxStars ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
