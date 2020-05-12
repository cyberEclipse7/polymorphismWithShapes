package inheritance.polymorrphism;

public class main {

    public static void main(String[] args) {
        
        Shape shapes[] = new Shape[4];
        
        shapes[0] = new Circle(22, 88, 4);
        shapes[1] = new Square(71, 96, 10);
        shapes[2] = new Sphere(8, 89, 2);
        shapes[3] = new Cube(79, 61, 8);

               
        for (Shape shape : shapes)
        {
            System.out.printf("%s: %s",shape.getName(), shape);
            if (shape instanceof twoDimensionalShape)
            {
                twoDimensionalShape TwoDimensionalShape = (twoDimensionalShape) shape;
                System.out.printf( "%s's area is %s\n",shape.getName(), TwoDimensionalShape.getArea() );
               
            } 
               
            if (shape instanceof threeDimensionalShape)
            {
               threeDimensionalShape ThreeDimensionalShape = (threeDimensionalShape) shape;
               System.out.printf( "%s's area is %.0f\n", shape.getName(), ThreeDimensionalShape.getArea() );
               System.out.printf( "%s's volume is %.0f\n", shape.getName(), ThreeDimensionalShape.getVolume() );  
            }
               System.out.println();
        }

    }
}
    

