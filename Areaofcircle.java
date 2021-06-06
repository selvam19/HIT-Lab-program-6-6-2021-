//Area of circle and circumference
import java.util.Scanner;
class Areaofcircle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println("Area of circle is: "+area);
        double circumference = Math.PI * 2 * radius;
        System.out.println("The circumference of circle is: "+circumference);
    }
}