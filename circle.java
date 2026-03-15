public class Circle {
    int radius;
    Circle(int r) {
        radius = r;
    }
    double area() {
        return 3.14 * radius * radius;
    }
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println("Area: " + c1.area());
    }
}
