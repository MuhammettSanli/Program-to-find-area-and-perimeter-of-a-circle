import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner girdi=new Scanner(System.in);

        double radius,perimeter,area,pi=3.141592653;

        System.out.println("Write the radius of the circle");
        radius=girdi.nextDouble();
        perimeter=2*pi*radius;
        area=pi*radius*radius;

        System.out.println("Area: "+area);
        System.out.println("Perimeter: "+perimeter);







    }
}
