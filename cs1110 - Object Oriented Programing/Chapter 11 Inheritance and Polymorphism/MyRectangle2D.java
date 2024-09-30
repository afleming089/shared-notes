//Exercise 10.13

class MyRectangle2D {
  private double x, y; // Center of the rectangle
  private double width, height;

  public MyRectangle2D() {
    x = y = 0;
    width = height = 1;
  }

  public MyRectangle2D(double x, double y, double width, double height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getPerimeter() {
    return 2 * (width + height);
  }

  public double getArea() {
    return width * height;
  }

  public boolean contains(double x, double y) {
    return Math.abs(x - this.x) <= width / 2 &&
      Math.abs(y - this.y) <= height / 2;
  }

  public boolean contains(MyRectangle2D r) {
    return contains(r.x - r.width / 2, r.y + r.height / 2) &&
      contains(r.x - r.width / 2, r.y - r.height / 2) &&
      contains(r.x + r.width / 2, r.y + r.height / 2) &&
      contains(r.x + r.width / 2, r.y - r.height / 2);
  }

  public boolean overlaps(MyRectangle2D r) {
    return Math.abs(this.x - r.x) <= (this.width + r.width) / 2 &&
      Math.abs(this.y - r.y) <= (this.height + r.height) / 2;
  }
}
