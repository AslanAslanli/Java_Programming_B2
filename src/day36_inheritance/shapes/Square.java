package day36_inheritance.shapes;

import com.sun.source.tree.BreakTree;

public class Square extends Shapes {
    private int side;
    public Square(int side) {
        super("Square");
        setSide(side);
        area();
        perimeter();
    }

    public double area(){
        return side*side;
    }


    public double perimeter() {
        return side*4;
    }

    public void setSide(int side) {
        if (side>0) this.side = side;
        else System.out.println("no negative side allowed");
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", name='" + name + '\'' +
                '}';
    }
}
