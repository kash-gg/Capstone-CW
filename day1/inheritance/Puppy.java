package day1.inheritance;

public class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }

    public static void main(String[] args) {
        Puppy obj = new Puppy();
        obj.weep();
        obj.bark();
        obj.eat();
    }
}
