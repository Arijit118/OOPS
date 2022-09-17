package OOPSTutorial;

public class HybridInheritance {
    public static void main(String args[]) {
        Dog doggy = new Dog();
        doggy.walk();

    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathe");
    }
}

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swim in water");
    }

}

class Bird extends Animal {
    int wings;

    void fly() {
        System.out.println("fly in air.");
    }
}

class Mammals extends Animal {
    int legs;

    void walk() {
        System.out.println("walks");
    }
}

class Dog extends Mammals {
    void run() {
        System.out.println("run fast");
    }
}
