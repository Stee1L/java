public class main {
    public static void main(String[] args) {
        int size = 1000000;
        double price = 20000;
        HardDrive AData = new HardDrive(512000);
        Computer PC1 = new Computer(size, "Lenovo", price);
        DesktopComputer PC2 = new DesktopComputer(2000000, "HP", 100000, 1920, 1080);
        System.out.println("AData size: " + AData.getSize());
        System.out.println("PC1 model: " + PC1.getModel());
        PC2.getInfo();
    }
}
