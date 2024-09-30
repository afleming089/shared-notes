public class TestSquare {

    public static void main(String[] args) {
        // create a square with side of 10
        Square sq1 = new Square(10);

        // calculate the area of the square
        // display that area
        System.out.println("Sq1 area: " + sq1.getArea());
        // calculate and display perimeter
        System.out.println("Sq1 perimeter: " + sq1.getPerimeter());

        // create a second square using no-arg constructor
        // area and perimeter
        Square sq2 = new Square();
        System.out.println("Sq2 area: " + sq2.getArea());
        System.out.println("Sq2 perimeter: " + sq2.getPerimeter());

    }
}