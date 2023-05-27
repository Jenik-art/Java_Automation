import java.util.Scanner;

public class HomeWork3 {
    public static void homeWork3_1() {
        String str = new String();
        Scanner scanner1 = new Scanner(System.in);

        while (!str.equalsIgnoreCase("exit")) {
            System.out.println("Please enter something");
            str = scanner1.nextLine();
        }
    }

    public static void homeWork3_2() {

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = scanner2.nextInt();
        int sum = 0;
        if (x > 0) {
            for (int i = 0; i <= x; i++) {
                sum += i;
            }
            System.out.printf("The sum of all numbers from 0 to %d is %d", x, sum);
        } else if (x < 0) {

            for (int j = 0; j >= x; j--) {
                sum += j;
            }
            System.out.printf("The sum of all numbers from %d  to 0 is %d", x, sum);
        } else {
            System.out.printf("The sum of all numbers from 0 to %d is 0", x);
        }
    }

    public static void homeWork3_3() {
        System.out.print("Please enter your score: ");
        Scanner scanner3 = new Scanner(System.in);
        int score;
        do {
            score = scanner3.nextInt();
            if (score >= 70 && score <= 100) {
                System.out.println("Congrats! You’ve passed the test!");
            } else if (score >= 0 && score <= 100) {
                System.out.println("Sorry, you’ve failed the test.");
            } else {
                System.out.println("Your number is incorrect. Please, enter valid number.");
            }
        } while (score < 0 || score > 100);
    }
}