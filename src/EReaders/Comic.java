package EReaders;


public class Comic extends Literature{
    private String author;
    private String name;
    private String cover;
    private String content;
    public static Comic[] comicList = new Comic[10];



    public Comic(String author, String name, String cover, String content) {
        this.author = author;
        this.name = name;
        this.cover = cover;
        this.content = content;
        printItemWasAdded(name);
    }


    @Override
    public String getAuthor() {
        return author;
    }
    @Override
    public String getName() {
        return name;
    }
}
