import java.awt.*;
import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Triangle Triangle = new Triangle(1,1.5,1);
        System.out.println(Triangle);
        System.out.println("The area: " + Triangle.getArea());
        System.out.println("The parameter: " + Triangle.getPerimeter());
        System.out.println("the color is: " + Triangle.getColor());
        System.out.println( "The triangle is filled: " + Triangle.isFilled());

    }
}