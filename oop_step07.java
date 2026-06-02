import java.util.ArrayList;

public class oop_step07 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Rafiul");
        names.add("John");
        names.add("Alex");

        System.out.println(names);

        System.out.println(names.get(0));

        names.remove("John");

        System.out.println(names);
    }
}