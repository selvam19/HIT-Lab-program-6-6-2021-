//Area of square
import java.util.Scanner;
class Areaofsquare
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of square: ");
        double side = sc.nextDouble();
        double area = side * side;
        System.out.println("Area of Square: "+area);
    }
}