//Area of Rectangle
import java.util.Scanner;
class Areaofrectangle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of rectangle: ");
        double width = sc.nextDouble();
        double area = length * width;
        System.out.println("Area of rectangle: "+area);
    }
}