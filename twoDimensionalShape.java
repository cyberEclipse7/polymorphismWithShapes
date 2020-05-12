package inheritance.polymorrphism;

public abstract class twoDimensionalShape extends Shape {
    
    private double dimension1;
    private double dimension2;
    
    public twoDimensionalShape(int x, int y, double dimension1, double dimension2)
    {
        super(x, y);
        set(dimension1, dimension2);
    }
    public double getDimension1()
    {
        return dimension1;
    }
    public double getDimension2()
    {
        return dimension2;
    }
    public void set(double dimension1, double dimension2)
    {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }
    public abstract double getArea();
}
