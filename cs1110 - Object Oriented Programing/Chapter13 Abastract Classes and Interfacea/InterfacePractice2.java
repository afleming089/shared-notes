//For InterfacePractice2
//Finish implementing the class Rectangle99 to
//use the interface Comparable and
//finish writing the method compareTo.
//Rectangle99 is a child of GeometricObject99

public class InterfacePractice2 {
    public static void main(String[] args) {
       // Rectangle99 rec1 = new Rectangle99();
       // Rectangle99 rec2 = new Rectangle99();
      //  System.out.println(rec1.equals(rec2));
      //  System.out.println(rec1.compareTo(rec2));
    }
}//InterfacePractice2

// Rectangle99 renamed, but is the Rectangle class that extends GeometricObject
//and will implement the interface Comparable
//class Rectangle99 extends GeometricObject99 *****{
//    private double width;
//    private double height;
//
///** Default constructor */
//public Rectangle99() {
//        this(1.0, 1.0);
//        }
//
///** Construct a rectangle with width and height */
//public Rectangle99(double width, double height) {
//        this.width = width;
//        this.height = height;
//        }
//
///** Return width */
//public double getWidth() {
//        return width;
//        }
//
///** Set a new width */
//public void setWidth(double width) {
//        this.width = width;
//        }
//
///** Return height */
//public double getHeight() {
//        return height;
//        }
//
///** Set a new height */
//public void setHeight(double height) {
//        this.height = height;
//        }
//
///** Implement the getArea method in GeometricObject */
//public double getArea() {
//        return width*height;
//        }
//
///** Implement the getPerimeter method in GeometricObject */
//public double getPerimeter() {
//        return 2*(width + height);
//        }
//
//@Override
//public String toString() {
//        return "[Rectangle] width = " + width +
//        " and height = " + height;
//        }
//
//
//
//public boolean equals(Rectangle99 obj) {
//        return this.getArea() == obj.getArea();
//        }
//        }


abstract class GeometricObject99 {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    protected GeometricObject99() {
        dateCreated = new java.util.Date();
    }

    /** Construct a geometric object with color and filled value */
    protected GeometricObject99(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** Return color */
    public String getColor() {
        return color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Return filled. Since filled is boolean,
     *  the get method is named isFilled */
    public boolean isFilled() {
        return filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }

    /** Abstract method getArea */
    public abstract double getArea();

    /** Abstract method getPerimeter */
    public abstract double getPerimeter();
}
