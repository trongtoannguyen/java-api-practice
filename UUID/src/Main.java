import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello UUID!");
        System.out.println("Enter to generate Object, q to quit!");
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (true) {
            if (!Objects.equals(scanner.nextLine(), "q")) {
                String name = "UUID " + i;
                i++;
                UuidGenerator generator = new UuidGenerator();
                generator.setName(name);
                System.out.println(generator);
            } else {
                break;
            }
        }
    }
}