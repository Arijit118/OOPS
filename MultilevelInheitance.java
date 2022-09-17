package OOPSTutorial;

public class MultilevelInheitance {
    public static void main(String args[]) {
        Dog doggy = new Dog();
        doggy.legs = 4;
        System.out.println("No. of legs of a dog is: " + doggy.legs);
        doggy.eat();
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathe");
    }
}

class Mammals extends Animal {
    int legs;
}

class Dog extends Mammals {
    String breed;
}