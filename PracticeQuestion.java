package OOPSTutorial;

public class PracticeQuestion {
    public static void main(String args[]) {
        Vehicle v = new Car();
        v.print(); // Here this is possible for Method Overriding
        Vehicle v2 = new Bus();
        // v2.print1();// This is not possible in java because Vechicle reference
        // variable can't access
        // print1 function.
    }
}

class Vehicle {
    void print() {
        System.out.println("Base class(Vehicle)");
    }
}

class Car extends Vehicle {
    void print() {
        System.out.println("Derived class");
    }
}

class Bus extends Vehicle {
    void print1() {
        System.out.println("Another Derived class");
    }
}