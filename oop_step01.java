class Student {

    // Variables
    String name;
    int age;

    // Method
    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class oop_step01 {

    public static void main(String[] args) {

        // Object create
        Student s1 = new Student();

        // Data assign
        s1.name = "Rafiul";
        s1.age = 25;

        // Method call
        s1.showInfo();
    }
}