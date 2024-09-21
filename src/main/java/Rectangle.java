package m;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calcArea() {
        return length * width;
    }

    public double calcPerimeter() {
        return 2 * (length + width);
    }

    public void draw() {
        for (int i = 0; i < (int) length; i++) {
            for (int j = 0; j < (int) width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

 
    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width + "]";
    }
}

