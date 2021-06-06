//Swap two number
public class Swaptwonumber
{
    public static void main(String[] args)
    {
        int firstvalue=100,secondvalue=200;
        System.out.println("***Before swapping***");
        System.out.println("First value is : "+firstvalue);
        System.out.println("Second value is: "+secondvalue);
        int temp=firstvalue;
        firstvalue=secondvalue;
        secondvalue=temp;
        System.out.println("***After swapping***");
        System.out.println("First value is : "+firstvalue);
        System.out.println("Second value is: "+secondvalue);
    }
}