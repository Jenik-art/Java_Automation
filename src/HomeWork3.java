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

    public static void homeWork3_4() {
        String[] channels = {"ABC", "BBC", "CNN", "MTV"};
        for ( int i=0; i<=channels.length -1; i++) {
            String menu = String.format("%d. %s", i+1, channels[i] );
                System.out.println(menu);
        }
        System.out.println("0. Exit");
        System.out.println("Make your choise");
        Scanner scanner = new Scanner(System.in);
        int choise;
        do {
            choise = scanner.nextInt();
            scanner.nextLine();
            if (choise > 0 && choise <=4){
                System.out.println(channels[choise-1]);
            } else if (choise != 0 && choise > 4) {
                System.out.println("Unknown channel");
            }
        } while (choise != 0);
    }
    public static void homeWork3_5(){
        int choise;
        String name = "";
        String surname = "";
        int dateOfBirth = 0;
        do {
            String[] commands = {"Enter Name", "Enter Surname", "Enter Birthday", "Show data"};
            for ( int i=0; i<= commands.length -1; i++) {
                String menu = String.format("%d. %s", i+1, commands[i] );
                System.out.println(menu);
            }
            System.out.println("0. Exit");
            System.out.println("Please, choose any options");

            Scanner scanner = new Scanner(System.in);
            choise = scanner.nextInt();
            scanner.nextLine();

            switch (choise) {
                case 1:
                    name = scanner.nextLine();
                    System.out.println("Name is: " + name);
                    break;
                case 2:
                    surname = scanner.nextLine();
                    System.out.println("Surname is: " + surname);
                    break;
                case 3:
                    dateOfBirth = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Date of Birth is: " + dateOfBirth);
                    break;
                case 4:
                    String case4 = String.format("Name: %s, Surname: %s, Date of Birth: %d", name, surname, dateOfBirth);
                    System.out.println(case4);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Unknown command");
            }
        } while (choise != 0);

    }
}