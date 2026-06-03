import java.util.HashMap;

public class oop_step08 {

    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();

        students.put("Rafiul", 25);
        students.put("John", 30);

        System.out.println(students.get("Rafiul"));
    }
}