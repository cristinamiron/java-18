public class Circle {
    //variabile de instanta
    public static final double PI= 3.14; // constanta

    double radius;
    String color;

    //constructor
    public Circle (double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    //metode
    public double getAria() {
        return PI * radius * radius;

    }

    public double getPerimeter(){
        return 2 *PI * radius;
    }

    @Override
    public String toString() {
     return "Circle with radius:" + this.radius + "color" +this.color;
    }
}
