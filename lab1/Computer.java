public class Computer extends HardDrive implements AutoCloseable{
    /** attributes */
    private String Model;
    private double Price;
    /** constructors */
    public Computer(int size, String model, double price)       /*constructor accepting custom values*/
    {
        super(size);
        if (model == null) throw new IllegalArgumentException("Invalid name");
        else Model = model;
        if (price <= 0) throw new IllegalArgumentException("Price must be greater then zero");
        else Price = price;
    }
    /** setters & getters */
    public String getModel() { return Model; }
    public double getPrice() { return Price; }
    public void setModel(String model) { Model = model; }

    @Override
    public void close() throws Exception
    {
        this.close();
    }
}
