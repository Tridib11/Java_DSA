package OOPS;

public class Main {
    public static void main(String[] args) {
        Student rohan = new Student();
        System.out.println(rohan.rno);
        System.out.println(rohan.marks);
        System.out.println(rohan.name);
        rohan.greeting();
    }
}
    class Student{
        int rno;
        String name;
        float marks=90;

        void greeting(){
            System.out.println("Hello! My name is "+ this.name);
        }
        Student(){
            this.rno=15;
            this.name="Tridib";
            this.marks=23.22f;
        }
        Student(int roll,String name,float marks){
            this.name=name;
            this.rno=roll;
            this.marks=marks;
        }
    }

