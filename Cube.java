package inheritance.polymorrphism;

// Definition of class Cube.

   public class Cube extends threeDimensionalShape
   {
         // three-argument constructor
         public Cube( int x, int y, int side )
         {
               super( x, y, side, side, side );
         } // end three-argument Cube constructor

         // overridden methods
         public String getName()
         {
               return "Cube";
         } // end method getName

         public double getArea()
         {
               return 6 * getSide() * getSide();
         } // end method getArea

         public double getVolume()
         {
               return getSide() * getSide() * getSide();
         } // end method getVolume

         // set method
         public void setSide( double side )
         {
               set(side, side, side);
         } // end method setSide

         // get method
         public double getSide()
         {
               return getDimension1();
         } // end method getSide

         public String toString()
         {
               return String.format( "%s %s: %.0f\n", super.toString(), "side", getSide() );
         } // end method toString
   } // end class Cube
