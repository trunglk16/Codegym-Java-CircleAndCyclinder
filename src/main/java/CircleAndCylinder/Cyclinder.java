package CircleAndCylinder;

public class Cyclinder extends Circle {
    double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cyclinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Volume of cyclinder: " + getVolume() + " , color is: " + super.getColor();
    }
}

