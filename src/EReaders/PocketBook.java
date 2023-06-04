package EReaders;

public class PocketBook implements EReader {
    private String brandName;
    private String modelName;
    private int storageValue;
    private double displaySize;
    private int resolution;
    private String deviceInfo;
    public PocketBook(String brandName, String modelName, int storageValue, double displaySize, int resolution ) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.storageValue = storageValue;
        this.displaySize = displaySize;
        this.resolution = resolution;
        this.deviceInfo = String.format("Brand: %s, Model: %s, Storage: %d GB, Display: %f, Resolution: %d",brandName,modelName,storageValue,displaySize,resolution);

    }

    @Override
    public String getReaderInfo() {
        return deviceInfo;
    }
}
