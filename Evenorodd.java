//Even number or odd number
import java.util.Scanner;
public class Evenorodd
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println(num+" is even number");
        }
        else
        {
            System.out.println(num+" is odd number0");
        }
    }
}
