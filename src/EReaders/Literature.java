package EReaders;

public class Literature {
    private String author;
    private String name;
    private String cover;
    private String content;

    protected String getAuthor(){
        return author;
    }
    protected String getName(){
        return name;
    }
    protected void printItemWasAdded(String name){
        String itemWasAdded = String.format("%s was added to library.",name);
        System.out.println(itemWasAdded);
    }
}
