//Reverse of a number
//128
//8
//80
//82
//820
//821
//it is a reverse of a number
class Reversenumber
{
    public static void main(String[] args) {
        int number = 128 , reversenumber = 0;
        while(number!=0)
        {
            reversenumber=reversenumber * 10;
            reversenumber=reversenumber + number % 10;
            number = number / 10;
        }
        System.out.println(reversenumber);
    }
}