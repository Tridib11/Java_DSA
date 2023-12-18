import java.util.Arrays;

public class String_methods {
    public static void main(String[] args) {
        String name="Tridib Ghosh";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println("     tridib     ".strip());
        System.out.println("    tridib     ".trim());
        System.out.println(Arrays.toString("Tridib ghosh ".split(" ")));
    }
}
