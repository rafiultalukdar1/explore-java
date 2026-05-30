class Person {
    String name;

    void display() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int age;
}

public class oop_step03 {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Rafiul";
        s1.age = 25;

        s1.display();

        System.out.println("Age: " + s1.age);
    }
}