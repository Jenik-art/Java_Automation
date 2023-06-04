import EReaders.*;

import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Amazon kindle = new Amazon("Amazon", "Kindle Paperwhite", 16, 6.8, 300);
        Book lor = new Book("J.R.R. Tolkien", "Lord of the Rings", "Picture", "Some content" );
        Book hobbit = new Book("J.R.R. Tolkien", "Hobbit", "Picture2","Some content2");
        printReaderInfo(kindle);
        userInteractions();


    }
    public static void printReaderInfo(EReader eReader){
        System.out.println(eReader.getReaderInfo());
        }
    public static void userInteractions() {
        int choise;
        System.out.println("What would you like to do? Make you choise.");
        do {
            String[] commands = {"Add new Amazon device", "Add new Book", "Add new Comic", "Add new AudioBook"};
            for (int i = 0; i <= commands.length - 1; i++) {
                String menu = String.format("%d. %s", i + 1, commands[i]);
                System.out.println(menu);
            }
            System.out.println("0. Exit");

            Scanner scanner = new Scanner(System.in);
            choise = scanner.nextInt();
            scanner.nextLine();
            String brandName;
            String modelName;
            int storageValue;
            double displaySize;
            int resolution;
            String author;
            String name;
            String cover;
            String content;

            switch (choise) {
                case 1:
                    System.out.println("Enter brand Name");
                    brandName = scanner.nextLine();
                    System.out.println("Enter model Name");
                    modelName = scanner.nextLine();
                    System.out.println("Add storage Value");
                    try {
                        storageValue = scanner.nextInt();
                        scanner.nextLine();
                    } catch (InputMismatchException e) {
                        storageValue = 0;
                        System.out.println("Wrong data added. Please, try again.");
                        break;
                    }
                    System.out.println("Add display Size");
                    try {
                        displaySize = scanner.nextDouble();;
                        scanner.nextLine();
                    } catch (InputMismatchException e) {
                        displaySize = 0;
                        System.out.println("Wrong data added. Please, try again.");
                        break;
                    }

                    System.out.println("Add resolution");
                    try {
                        resolution = scanner.nextInt();
                        scanner.nextLine();
                    } catch (InputMismatchException e) {
                        resolution = 0;
                        System.out.println("Wrong data added. Please, try again.");
                        break;
                    }
                    Amazon newAmazon = new Amazon(brandName,modelName,storageValue,displaySize,resolution);
                    break;
                case 2:
                    System.out.println("Enter author");
                    author = scanner.nextLine();
                    System.out.println("Enter name");
                    name = scanner.nextLine();
                    System.out.println("Add cover");
                    cover = scanner.nextLine();
                    System.out.println("Add content");
                    content = scanner.nextLine();
                    Book newBook = new Book(author, name, cover, content);
                    break;
                case 3:
                    System.out.println("Enter author");
                    author = scanner.nextLine();
                    System.out.println("Enter name");
                    name = scanner.nextLine();
                    System.out.println("Add cover");
                    cover = scanner.nextLine();
                    System.out.println("Add content");
                    content = scanner.nextLine();
                    Comic newComic = new Comic(author, name, cover, content);
                    break;
                case 4:
                    System.out.println("Enter author");
                    author = scanner.nextLine();
                    System.out.println("Enter name");
                    name = scanner.nextLine();
                    System.out.println("Add cover");
                    cover = scanner.nextLine();
                    System.out.println("Add content");
                    content = scanner.nextLine();
                    AudioBook newAudioBook = new AudioBook(author, name, cover, content);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Unknown command");
            }

        } while (choise != 0) ;
    }
}