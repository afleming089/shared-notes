public class Square {
    int length = 0;

    // Constructors
    Square() {
        this.length = 3;
    }

    Square(int length) {
        this.length = length;
    }

    // Get methods
    int getArea() {
        return length * length;
    }

    int getPerimeter() {
        return length * 4;
    }
}// end class Square
