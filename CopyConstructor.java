package OOPSTutorial;

public class CopyConstructor {
    public static void main(String args[]) {
        Student std1 = new Student();
        std1.name = "Arijit";
        std1.roll = 31;
        std1.password = "abcd";
        std1.marks[0] = 98;
        std1.marks[1] = 97;
        std1.marks[2] = 99;

        Student std2 = new Student(std1);
        std2.password = "xyz";
        std1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(std2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // Shallow Copy Constructor
    Student(Student std1) {
        this.name = std1.name;
        this.roll = std1.roll;
        this.marks = std1.marks;
    }

    // Non-parameterized Constructor
    Student() {
        marks = new int[3];
        System.out.println("Constructor is called..");
    }

    // Parameterized Constructor
    Student(String name) {
        marks = new int[3];
        this.name = name;
    }
}
