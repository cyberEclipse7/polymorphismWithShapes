package inheritance.polymorrphism;

public class Circle extends twoDimensionalShape {
    
         public Circle( int x, int y, int radius )
         {
               super( x, y, radius, radius );
         } // end three-argument Square constructor

         // overridden methods
         public String getName()
         {
               return "Circle";
         } // end method getName

         public double getArea()
         {
               return (int)(Math.PI * getRadius() * getRadius());
         } // end method getArea

         // set method
         public void setRadius( int radius )
         {
               set(radius, radius);
         } // end method setSide

         // get method
         public double getRadius()
         {
               return getDimension1();
         } // end method getSide

         public String toString()
         {
               return String.format( "%s %s: %.0f\n", super.toString(), "radius", getRadius() );
         } // end method toString
    
}
