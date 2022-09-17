package OOPSTutorial;

public class MultipleInheritance {
    public static void main(String args[]) {
        Beer b = new Beer();
        b.eatPlant();
        b.eatFlesh();
    }
}

interface Herbivore {// herbivore are animal whose primary food is plant based.
    void eatPlant();
}

interface Carnivore {// carnivore are meat eater
    void eatFlesh();
}

class Beer implements Herbivore, Carnivore {
    public void eatPlant() {
        System.out.println("Beer eats plants.");
    }

    public void eatFlesh() {
        System.out.println("Beer eats Flesh also");
    }
}