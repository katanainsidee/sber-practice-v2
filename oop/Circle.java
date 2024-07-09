public class Circle {
    private float radius;
    private String color;

    public double area() {
        return Math.round(Math.PI * Math.pow(this.radius, 2) * 100) / 100.0;
    }

    public double perimeter() {
        return Math.round(2 * Math.PI * this.radius * 100) / 100.0;
    }

    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String toString() {
        System.out.printf("%s, %s, %s, %s\n", this.radius, this.color, this.area(), this.perimeter());

        return null;
    }

}
