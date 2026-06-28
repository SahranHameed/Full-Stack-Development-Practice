// Child Class: Student — extends Person + implements Borrowable
public class Student extends Person implements Borrowable {

    Student(int id, String name) {
        super(id, name);
    }

    @Override
    public void borrowItem() {
        System.out.println("Student " + name + " has borrowed a book.");
    }

    @Override
    public void returnItem() {
        System.out.println("Student " + name + " has returned the book.");
    }
}

