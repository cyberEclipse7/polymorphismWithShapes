package inheritance.polymorrphism;

public abstract class threeDimensionalShape extends Shape {
    private double dimension1;
    private double dimension2;
    private double dimension3;
    
    public threeDimensionalShape(int x, int y ,double dimension1, double dimension2, double dimension3)
    {
        super(x, y);
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
        this.dimension3 = dimension3;
    }
    public double getDimension1()
    {
        return dimension1;
    }
    public double getDimension2()
    {
        return dimension2;
    }
    public double getDimension3()
    {
        return dimension3;
    }
    public void set(double dimension1, double dimension2, double dimension3)
    {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
        this.dimension3 = dimension3;
    }
    public abstract double getArea();
    public abstract double getVolume();
}
