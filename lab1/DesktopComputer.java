public class DesktopComputer extends Computer{
    /** attributes */
    private int ScreenWidth, ScreenHeight;
    /** constructors */
    //public DesktopComputer(){}
    public DesktopComputer(int size, String model, double price, int screenWidth, int screenHeight)
    {
        super(size, model, price);
        if (screenWidth <= 0) throw new ArithmeticException("Size must be greater then zero");
        else ScreenHeight = screenHeight;
        if (screenHeight <= 0) throw new ArithmeticException("Size must be greater then zero");
        else ScreenWidth = screenWidth;
    }
    /** setters & getters */
    public int getScreenWidth() { return ScreenWidth; }
    public int getScreenHeight() { return ScreenHeight; }
    public void setScreenWidth(int screenWidth) { ScreenWidth = screenWidth; }
    public void setScreenHeight(int screenHeight) { ScreenHeight = screenHeight; }

    public void getInfo()
    {
        System.out.println("Device Model: " + getModel());
        System.out.println("Memory: " + getSize());
        System.out.println("Price: " + getPrice());
        System.out.print("Screen size: " + ScreenHeight + " x " + ScreenWidth);
    }
}
