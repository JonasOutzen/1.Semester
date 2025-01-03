package Task4;

import java.util.ArrayList;

public class Shapebuilder {

    ArrayList<Shape> shapes;
    public Shapebuilder() {
        shapes = new ArrayList<>();
    }
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public double getTotalArea() {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}
