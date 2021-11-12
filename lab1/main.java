public class main {
    public static void main(String[] args) {
        int size = 1000000;
        double price = 20000;
        HardDrive AData = new HardDrive(512000);
        Computer PC1 = new Computer(size, "Lenovo", price);
        DesktopComputer PC2 = new DesktopComputer(2000000, "HP", 100000, 1920, 1080);
        AData.setSize(256000);
        System.out.println("AData size: " + AData.getSize());
        PC1.setModel("MSI");
        System.out.println("PC1 model: " + PC1.getModel());
        PC2.getInfo();
        PC2.setScreenHeight(2160);
        PC2.setScreenWidth(3840);
        System.out.print("\nPC2 resolution is " + PC2.getScreenWidth() + " x " + PC2.getScreenHeight());
    }
}
