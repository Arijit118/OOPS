package OOPSTutorial;

public class Constructor {
    public static void main(String args[]) {
        Student std1 = new Student();
        Student std2 = new Student("arijit");
        System.out.println(std2.name);
        Student std3 = new Student(31);
        System.out.println(std3.roll);
    }
}

class Student {
    String name;
    int roll;

    //Non-parameterized constractor
    Student() {
       System.out.println("Constractor is called..");
    }

    //Parameterized constractor
    Student(String name) {
        this.name = name;
    }

    //Parameterized constractor
    Student(int roll) {
        this.roll = roll;
    }

}