package OOPS;

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student_Percentage st = new Student_Percentage(12, 13, 78);
        st.percentage(12, 13, 78);
    }
}
 class Student_Percentage {
    int ph;
    int ch;
    int ma;

    void percentage(int physics, int chemistry, int maths) {
        System.out.println((physics + chemistry + maths) / 3);
    }

    public Student_Percentage(int physics, int chemistry, int maths) {
        this.ph = physics;
        this.ch = chemistry;
        this.ma = maths;
        System.out.println((ph + ch + ma) / 3);
    }
}
