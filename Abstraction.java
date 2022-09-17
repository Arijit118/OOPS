package OOPSTutorial;

public class Abstraction {
    public static void main(String args[]) {
        /*
         * We can acheive abstraction by abtract class and interface in java
         */
        Horse h = new Horse();
        h.eat();
        h.walk();

        // Animal a = new Animal(); We can not create object of Animal class because
        // it is a abstract class.

        // Use of Contructor
        System.out.println(h.color);

    }
}

abstract class Animal {
    /*
     * We can't define object of a abstract class but
     * we can create constructor of a abstract class.(why??)
     */
    String color;

    Animal() {
        color = "brown";
    }

    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {

    void changeColor() {
        color = "dark brown";
        System.out.println("Horse constructor called");
    }

    void walk() {
        System.out.println("Walk on 4 legs");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("Walk on 2 legs");
    }
}