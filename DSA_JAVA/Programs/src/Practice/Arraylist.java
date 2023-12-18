import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(10);
//        list.add(67);
//        list.add(243);
//        list.add(2342);
//        list.add(23432);
//        list.add(342);
//        list.add(34);
//        list.add(56);
//        list.add(666);
//        list.add(5455);
//        list.add(66666);
//        list.add(324);
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));

        }
//        for(int j:list){
//            System.out.println(list.get(j));
//        }
//        System.out.println(list);


    }
}
