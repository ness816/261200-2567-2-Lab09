public class Ellipse extends Shape {
    private double A;
    private double B;

    public Ellipse(double A,double B) {
        this.A = A;
        this.B = B;
    }

    public void setA(double A) {
        this.A = A;
    }

    public void setB(double B) {
        this.B = B;
    }

    public double getA() {
        return A;
    }

    public double getB() {
        return B;
    }

    public double calculateArea() {
        return Math.PI * this.A * this.B;
    }









}

