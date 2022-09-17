package OOPSTutorial;

public class PracticeQuestionTwo {
    public static void main(String args[]) {
        System.out.print(Book.count);
        Book b1 = new Book(150);
        Book b2 = new Book(200);
        System.out.print(Book.count);

        // Output: 0 2
    }
}

class Book {
    int price;
    static int count;

    public Book(int price) {
        this.price = price;
        count++;
    }
}
