package OOPSTutorial;

public class OOPSBasics {
    public static void main(String args[]) {
        Pen p1 = new Pen(); // Created a object of Pen called p1
        p1.setColor("Green");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        // p1.setColor("Yellow");
        p1.color = "Yellow";
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "arijitroy";
        myAcc.setPass("abcdefghij");
        // We can't see the password in main class, we only can change the password.
    }
}

class BankAccount {
    String username;
    private String password;

    public void setPass(String newPass) {
        password = newPass;
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}
