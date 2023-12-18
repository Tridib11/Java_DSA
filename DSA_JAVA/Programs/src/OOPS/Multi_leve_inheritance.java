

package OOPS;

public class Multi_leve_inheritance  {
    public static void main(String[] args) {
        Mammals_new shark=new Mammals_new();
        shark.Big();
        shark.years=2001;
        System.out.println(shark.years);
    }
}

class Animal_new{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class Fish_new extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water");
    }
}

class Mammals_new extends Animal{
    int years;
    void Big(){
        System.out.println("Multi level inheritance called");
    }
}

