public class Main {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        Shape rectangle = new Rectangle(6, 7);
        Shape circle = new Circle(2);
        Shape ellipse = new Ellipse(1, 3);

        System.out.println("Rectangle Area: " + calculator.calculateArea(rectangle));
        System.out.println("Circle Area: " + calculator.calculateArea(circle));
        System.out.println("Ellipse Area: " + calculator.calculateArea(ellipse));
    }
}