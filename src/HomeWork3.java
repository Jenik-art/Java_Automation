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
    public static void homeWork3_2(){

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = scanner2.nextInt();
        int sum = 0;
        if ( x > 0) {
            for (int i = 0; i <= x; i++) {
                sum += i;
            }
            System.out.printf("The sum of all numbers from 0 to %d is %d", x, sum);
        }
            else if (x < 0)  {

                    for (int j = 0; j >= x; j--) {
                        sum += j;
                    }
            System.out.printf("The sum of all numbers from %d 0 tois %d", x, sum);
            }
            else {
                        System.out.printf("The sum of all numbers from 0 to %d is 0",x);
                    }
        }

    }
