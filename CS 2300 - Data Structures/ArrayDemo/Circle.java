public class Circle implements Comparable<Circle> {
    double radius;

    public Circle(double r) {
        radius = r;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        Circle circle = (Circle) obj;

        // this objects radius is radius
        // circle.radius is the object that is passed ins radius.
        return circle.radius == radius;
    }

    public int compareTo(Circle c) {
        if (radius == c.radius)
            return 0;
        else if (radius < c.radius)
            return -1;
        else
            return 1;
    }

    @Override
    public String toString() {
        return "Circle(" + radius + ")";
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        System.out.println(c1.getArea()); // 28.26
        System.out.println(c1.getPerimeter()); // 18.84
        System.out.println(c1.toString());

        Circle c2 = new Circle(4);
        System.out.println(c2.getArea()); // 50.24
        System.out.println(c2.getPerimeter()); // 25.12

        System.out.println(c2.toString());

    }
}
