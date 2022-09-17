package OOPSTutorial;

public class JavaGetterSetter {
    
    public static void main(String args[]) {
        Pen p2 = new Pen();
        p2.setColor("Blue");
        System.out.println(p2.getColor());

        p2.setTip(5);
        System.out.println(p2.getTip());

        p2.setColor("Yellow");
       System.out.println(p2.getColor());

    }
}

class Pen {
    private String color;
    private int tip;

    //Getters
    public String getColor() {
        return this.color;
    }

    public int getTip() {
        return this.tip;
    } 

    //Setters
    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
    
}


