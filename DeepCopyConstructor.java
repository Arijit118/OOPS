package OOPSTutorial;

public class DeepCopyConstructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "arijit";
        s1.roll = 31;
        s1.password = "abcd";
        s1.marks[0] = 80;
        s1.marks[1] = 85;
        s1.marks[2] = 90;

        Student std2 = new Student(s1);// copy
        s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(std2.marks[i]);
        }
        /*
         * Output should be 80, 85, 90
         * change of s1 marks[2] should not reflect in s2.marks[2]
         */
    }

}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // Deep Copy Constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student() {
        marks = new int[3];
        System.out.println("Constructor is calling..");
    }

}
