package OOPSTutorial;

public class Inheritance {
    public static void main(String args[]) {
        Fish shark = new Fish();
        shark.eat();
    }
}

// Base class or Parent Class
class Animal {
    // Propertise
    String color;

    // methods
    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathe");
    }
}

// Child class or Derived class or sub class
class Fish extends Animal {
    int fins;// wings

    void swim() {
        System.out.println("Swim in water.");
    }
}