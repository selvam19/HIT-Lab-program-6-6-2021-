//Armstrong number
//371
//1^3=1
//7^3=343
//3^3=27
//1+343+27=371
//371=371 is equal it is armstrong number otherwise not armstrong number
class Armstrong
{
    public static void main(String[] args) {
        int number=371 , remainder , result=0;
        int copynumber = number;
        while(copynumber != 0)
        {
            remainder = copynumber % 10;
            result += Math.pow(remainder, 3);
            copynumber = copynumber / 10;
        }
        if(result == number)
        {
            System.out.println(number+" is a armstrong number");
        }
        else
        {
            System.out.println(number+" is not a armstrong number");
        }
    }
}