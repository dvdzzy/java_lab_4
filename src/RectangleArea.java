import java.util.Scanner;

public class RectangleArea {

    private double length;
    private double width;
    private double area;

    Scanner scanner = new Scanner(System.in);

    public void getData() {
        System.out.print("Enter rectangle length: ");
        length = scanner.nextDouble();

        System.out.print("Enter rectangle width: ");
        width = scanner.nextDouble();
    }

    public void computeField() {
        area = length * width;
    }

    public void fieldDisplay() {
        System.out.println("Rectangle length: " + length);
        System.out.println("Rectangle width: " + width);
        System.out.println("Rectangle area: " + area);
    }
}