//Area of Triangle
import java.util.Scanner;
class Areaoftriangle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width of triangle: ");
        double width = sc.nextDouble();
        System.out.print("Enter the width of triangle: ");
        double length = sc.nextDouble();
        double area = (width * length) / 2;
        System.out.println("Area of Triangle: "+area);
    }
}