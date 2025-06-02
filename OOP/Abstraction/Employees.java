package OOP.Abstraction;

abstract class Employee {

    public void dance(){
        System.out.println("workers are dancing.....");
    }

    //The abstract method doWork() is like saying: “Every employee must work, 
    //but we don't know how they work until we know what kind of employee they are.”

    //A Developer will code.
    //A Manager will schedule meetings.
    //A Cleaner will tidy the office.

    abstract void doWork();  // All employees must work, but how?
}

class Developer extends Employee {
    void doWork() {
        System.out.println("Writing code...");
    }
}

class Manager extends Employee {
    void doWork() {
        System.out.println("Holding meetings...");
    }
}

class Cleaner extends Employee {
    void doWork() {
        System.out.println("Cleaning the office...");
    }
}

public class Employees {
    public static void main(String[] args) {

        Developer dev = new Developer();
        Manager mgr = new Manager();
        Cleaner janitor = new Cleaner();

        dev.doWork();     // Output: Writing code...
        mgr.doWork();     // Output: Holding meetings...
        janitor.doWork(); // Output: Cleaning the office...
    }
}
