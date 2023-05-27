import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = new String();
        Scanner scanner = new Scanner(System.in);
        while (!str.equalsIgnoreCase("exit")) {
            System.out.println("Please enter something");
            str = scanner.nextLine();
        }
    }
}