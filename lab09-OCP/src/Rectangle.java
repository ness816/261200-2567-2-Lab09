import static javax.swing.Spring.height;

public class Rectangle extends Shape {
    private double Height;
    private double Width;

    //getters and setters

    public Rectangle(double Height,double Width) {
        this.Height = Height;
        this.Width = Width;

    }

    public void setHeight(double Height){
        this.Height = Height;
    }

    public void setWidth(double Width){
        this.Width = Width;
    }

    public double getHeight() {
        return this.Height;
    }

    public double getWidth() {
        return this.Width;
    }


    @Override
    public double calculateArea() {
        return this.Width * this.Height;
    }

}
