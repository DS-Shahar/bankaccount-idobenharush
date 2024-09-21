package m;
import java.util.Scanner;

public class Main {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        Rectangle ido = new Rectangle(5.5, 5.5);
        Rectangle shahar = new Rectangle(9.5, 5.5);
        Circle shahargever = new Circle(6);
        Circle idogever = new Circle(5);

        System.out.println("Drawing the 'ido' rectangle:");
        ido.draw();
        System.out.println("Drawing the 'shahar' rectangle:");
        shahar.draw();
        ido.setLength(ido.getLength() * 2);
        ido.setWidth(ido.getWidth() * 2);

        System.out.println("Drawing the 'ido' rectangle after doubling:");
        ido.draw();

        double areaIdo = ido.calcArea();
        double areaShahar = shahar.calcArea();
        double totalArea = areaIdo + areaShahar;
        
        double perimeterIdo = ido.calcPerimeter();
        double perimeterShahar = shahar.calcPerimeter();
        double totalPerimeter = perimeterIdo + perimeterShahar;
        System.out.println("Total Area: " + totalArea);
        System.out.println("Total Perimeter: " + totalPerimeter);
        System.out.println("Area of Shahar circle: " + shahargever.area());
        System.out.println("Area of Ido circle: " +  idogever.area());
    }
}
