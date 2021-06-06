//power of number using while-loop
class Powerofnumber
{
    public static void main(String[] args)
    {
        int a=10,b=5;
        long result=1;
        while(b != 0)
        {
            result *= a;//result=result+a;
            --b;
        }
        System.out.println(result);

    }
}