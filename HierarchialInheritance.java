package OOPSTutorial;

public class HierarchialInheritance {
    public static void main(String args[]) {
        Mammal m1 = new Mammal();
        m1.color = "fairy black";
        System.out.println(m1.color);
        Fish f1 = new Fish();
        f1.eat();

    }
}

// Base Class
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathe");
    }
}

// Derived class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Can swim in water");
    }
}

// Derived class
class Bird extends Animal {
    int wings;

    void fly() {
        System.out.println("Can fly in air");
    }
}

// Derived class
class Mammal extends Animal {
    void walk() {
        System.out.println("Can Walk");
    }
}