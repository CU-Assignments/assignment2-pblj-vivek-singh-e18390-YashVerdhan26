// Abstract class Person
abstract class Person {
    protected String name;
    protected int age;

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method to display details (to be overridden by derived classes)
    public abstract void displayDetails();
}

// Derived class Student
class Student extends Person {
    @SuppressWarnings("FieldMayBeFinal")
    private int rollNumber;

    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}

// Derived class Teacher
class Teacher extends Person {
    @SuppressWarnings("FieldMayBeFinal")
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        System.out.println("Teacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}

public class StudentInformationSystem {
    public static void main(String[] args) {
        // Creating a student instance
        Student student = new Student("Alice", 20, 101);
        student.displayDetails();

        // Creating a teacher instance
        Teacher teacher = new Teacher("Mr. Smith", 40, "Mathematics");
        teacher.displayDetails();
    }
}
