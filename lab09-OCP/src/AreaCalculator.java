public class AreaCalculator {
    public double calculateArea(Shape shape) {
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.getWidth() * rectangle.getHeight();
        }
        else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.getRadius() * circle.getRadius();
        }
        else if (shape instanceof Ellipse) {
            Ellipse ellipse = (Ellipse) shape;
            return Math.PI * ellipse.getA() * ellipse.getB();
        }
        return 0;
    }
}
