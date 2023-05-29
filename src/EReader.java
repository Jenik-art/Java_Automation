public class EReader {
    private String brandName;
    private String modelName;
    private int storageValue;
    private double displaySize;
    private int resolution;
    private Book[] listOfBooks;

    public EReader(String brandName, String modelName, int storageValue, double displaySize, int resolution ){
        this.brandName = brandName;
        this.modelName = modelName;
        this.storageValue = storageValue;
        this.displaySize = displaySize;
        this.resolution = resolution;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModelName() {
        return modelName;
    }
}
