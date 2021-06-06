//Swap two number without using temporary variable
public class Swapwithouttempvariable
{
    public static void main(String[] args)
    {
        int firstvalue=100,secondvalue=200;
        System.out.println("***Before swapping***");
        System.out.println("First value is : "+firstvalue);
        System.out.println("Second value is: "+secondvalue);
        firstvalue=firstvalue + secondvalue;//100+200=300
        secondvalue=firstvalue - secondvalue;//300-200=100
        firstvalue=firstvalue - secondvalue;//300-100=200
        System.out.println("***After swapping***");
        System.out.println("First value is : "+firstvalue);
        System.out.println("Second value is: "+secondvalue);
    }
}