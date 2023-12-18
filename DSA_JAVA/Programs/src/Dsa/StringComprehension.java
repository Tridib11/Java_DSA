package Dsa;

import java.util.Arrays;

public class StringComprehension {
    public static void main(String[] args) {
        char[] s={'a','a','b','b','c','c','c'};
        System.out.println(newStr(s));

    }
    static int newStr(char[] chars){
        int n = chars.length;
        if (n == 1) {
            return n;
        }
        int count = 1;
        int index = 0;
        for (int i = 0; i <= n - 1; i++) {
            count = 1;
            while (i < n - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }
            chars[index] = chars[i]; // Assign first
            index++; // Then increment
            if (count > 1) {
                String s = String.valueOf(count);
                for (char a : s.toCharArray()) {
                    chars[index] = a; // Assign first
                    index++; // Then increment
                }
            }
        }
        return index;
    }
}
