import java.io.FileWriter;

public class oop_step09 {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("test.txt");

            writer.write("Hello Java");
            writer.close();

            System.out.println("File written successfully!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}