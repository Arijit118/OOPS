package OOPSTutorial;

class Automobile {
    private String drive() {
        return "Driving vehicle";
    }
}

class Car extends Automobile {
    protected String drive() {
        return "Driving car";
    }

}

public class AssignmentQTwo extends Car {
    @Override
    public final String drive() {
        return "Driving electric car";
    }

    public static void main(String args[]) {
        final Car c = new AssignmentQTwo();
        System.out.println(c.drive());
    }
}
