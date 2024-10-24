package Task4;

public class Main {
    public static void main(String[] args) {
        Shapebuilder shapebuilder = new Shapebuilder();

        Square firkant = new Square(10);
        Circle cirkel = new Circle(2);

        double areaCircle = cirkel.getArea();
        System.out.println("Areal cirkel: " + areaCircle);

        double areaSquare = firkant.getArea();
        System.out.println("Areal firkant: " + areaSquare);

        shapebuilder.addShape(firkant);
        shapebuilder.addShape(cirkel);

        System.out.println("Total area of shapes: " + shapebuilder.getTotalArea());
    }

}
