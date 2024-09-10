public class storageCapability {
    public static void main(String[] args) {
        int filesSize = 256;
        int filesInStorage = (5000 / filesSize);
        int freeSpace = 5000 - (filesInStorage * 256);
        System.out.println("The storage will be able to fit " + filesInStorage + " files");
        System.out.println(freeSpace + " GB will remain");
    }
}
