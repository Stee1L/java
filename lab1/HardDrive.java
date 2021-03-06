public class HardDrive {
    /** attributes */
    private int Size;
    /** constructors */
    public HardDrive(int size)             /* constructor taking a size of an int type */
    {
        if (size <= 0) throw new IllegalArgumentException("Size must be greater then zero");
        else Size = size;
    }
    /** setters & getters */
    public int getSize() { return Size; }
    public void setSize(int size) { Size = size; }
}

