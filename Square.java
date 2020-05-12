package inheritance.polymorrphism;   

// Definition of class Square.

   public class Square extends twoDimensionalShape
   {
         // three-argument constructor
         public Square( int x, int y, double side )
         {
               super( x, y, side, side );
         } // end three-argument Square constructor

         // overridden methods
         public String getName()
         {
               return "Square";
         } // end method getName

         public double getArea()
         {
               return getSide() * getSide();
         } // end method getArea

         // set method
         public void setSide( double side )
         {
               set(side, side);
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
   } // end class Square
