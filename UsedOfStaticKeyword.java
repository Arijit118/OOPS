package OOPSTutorial;

public class UsedOfStaticKeyword {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.schoolName = "PGMHS";
        Student s2 = new Student();
        System.out.println(s2.schoolName);
        System.out.println(s2.calculatePercentage(90, 80, 85));
    }
}

class Student {
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    static int calculatePercentage(int math, int phy, int chem) {
        return (math + phy + chem) / 3;
    }
}
