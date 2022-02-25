//Properties (instance variables) and the constructors of MyShape, Circle, Square, and MyCar are shown below. Use them and add more properties and behaviors as needed.
 
public abstract class MyShape implements CarCollision {
 
     // location = center of Circle or Square (not upper-left corner)
     private final Point2D.Double location;
     private Color color;
 
     // size = diameter (2 x radius) if Circle
     //        a side if Square
     private final int size;
 
     public MyShape(Point2D.Double location, Color color, int size) {
          this.location = location;
          this.color = color;
          this.size = size;
     }
 
     public abstract void draw(Graphics2D g2);
            . . .
            . . .
} // end of MyShape
 
public class Circle extends MyShape {
 
     public Circle(int x, int y, Color color, int size) {
          super(new Point2D.Double(x, y), color, size);
     }
 
     @Override
     public void draw(Graphics2D g2) {
          ... // implement here!
     }
 
     @Override
     public Rectangle2D.Double getCollisionBox() {
          ... // implement here!
     }
 
} // end of Circle
 
public class Square extends MyShape {
 
     public Square(int x, int y, Color color, int size) {
          super(new Point2D.Double(x, y), color, size);
     }
 
     @Override
     public void draw(Graphics2D g2) {
          ... // implement here!
     }
 
     @Override
     public Rectangle2D.Double getCollisionBox() {
          ... // implement here
     }
 
} // end of Square
 