package day1.inheritance;

public class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }

    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.eat();
        obj.bark();
    }
}