class Student {

    String name;
    int age;

    // Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void showInfo() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class oop_step02 {

    public static void main(String[] args) {

        Student s1 = new Student("Rafiul", 25);

        s1.showInfo();
    }
}