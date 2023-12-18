package Patterns;

public class Diamond {
    public static void main(String[] args) {
        int size = 5;

        for (int i = 1; i <= 2 * size - 1; i++) {
            int maxStars = i <= size ? i : 2 * size - i;
            int numofSpaces=5-maxStars;
            for (int j = 0; j < numofSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= maxStars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

