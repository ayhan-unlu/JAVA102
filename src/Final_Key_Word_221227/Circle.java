package Final_Key_Word_221227;

public class Circle {
    public int radius;
    public static final double PI_CONSTANT=3.14;

    public Circle(int radius) {
        this.radius = radius;
    //    this.pi=3.11;
    }

    public void calculateArea() {
        double circleArea = Circle.PI_CONSTANT * this.radius * this.radius;
        System.out.println("The Area of circle : "+circleArea);
    }

}
