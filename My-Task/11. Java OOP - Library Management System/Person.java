// ════════════════════════════════════════════
// 2. INHERITANCE — Base Class: Person
// ════════════════════════════════════════════
public class Person {
    String name;
    int    id;

    Person(int id, String name) {
        this.id   = id;
        this.name = name;
    }

    void displayInfo() {
        System.out.println("Name : " + name + " | ID: " + id);
    }
}

// Child Class: Librarian — extends Person
class Librarian extends Person {

    Librarian(int id, String name) {
        super(id, name);
    }

    void manageBooks() {
        System.out.println("Librarian " + name + " is managing the books.");
    }
}
