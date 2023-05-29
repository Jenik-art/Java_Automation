

public class Main {
    public static void main(String[] args) {
        //HomeWork3.homeWork3_1();
        //HomeWork3.homeWork3_2();
        //HomeWork3.homeWork3_3();
        //HomeWork3.homeWork3_4();
        //HomeWork3.homeWork3_5();

        EReader kindle = new EReader("Amazon","Kindle Paperwhite",16, 6.8, 300);
        Book lordOfTheRings = new Book("J.R.R. Tolkien", "Lord of the Rings", "Picture", "Some content" );
        Book hobbit = new Book("J.R.R. Tolkien", "Hobbit", "Picture2","Some content2");

        String result = lordOfTheRings.getAuthor();
        System.out.println(result);




    }
}