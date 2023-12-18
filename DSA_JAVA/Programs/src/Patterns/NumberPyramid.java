package Patterns;

public class NumberPyramid {
    public static void main(String[] args) {
        for (int row = 1; row <=5; row++) {
            for (int i = 0; i <5-row; i++) {
                System.out.print(" ");

            }
            for (int col =row ; col >=1 ; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <=row ; col++) {
                System.out.print(col);

            }
            System.out.println();

        }
    }
}
