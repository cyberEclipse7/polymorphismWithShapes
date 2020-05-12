package inheritance.polymorrphism;

public class Sphere extends threeDimensionalShape{
    
    // three-argument constructor
         public Sphere( int x, int y, int radius )
         {
            super( x, y, radius, radius, radius );
         } // end three-argument Cube constructor

         // overridden methods
         public String getName()
         {
               return "Sphere";
         } // end method getName

         public double getArea()
         {
               return 4 * Math.PI * getRadius() * getRadius();
         } // end method getArea

         public double getVolume()
         {
               return ((4 * Math.PI * getRadius() * getRadius() * getRadius()) / 3);
         } // end method getVolume

         // set method
         public void setRadius( double radius )
         {
               set(radius, radius, radius);
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
