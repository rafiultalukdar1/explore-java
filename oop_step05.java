class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Woof");
    }
}

public class oop_step05 {
    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();
    }
}