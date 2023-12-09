package day36_inheritance.shapes;

public class Circle extends Shapes{
    int radius;
    public Circle(int radius){
        super("Circle");
        this.radius = radius;
    }
    public double area(){
        return radius*radius*Math.PI;
    }


    public double perimeter() {
        return 2*Math.PI*radius;
    }

}
