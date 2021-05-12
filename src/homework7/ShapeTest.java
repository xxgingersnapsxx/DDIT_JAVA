package homework7;
public class ShapeTest {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		shapes[0] = new Circle(1.0);
		shapes[1] = new Triangle(2.0);
		shapes[2] = new Rectangle(2.0, 3.0);
		// foreach문
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i]);
		}
		for (Shape shape : shapes) {
			System.out.println(shape);
		}
	}
}