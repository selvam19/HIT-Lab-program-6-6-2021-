//LCM program
class LCM
{
    public static void main(String[] args) {
        int a=5,b=21;
        int lcm=(a>b)?a:b;//ternary operator
        while(true)
        {
            if(lcm % a == 0 && lcm % b== 0)
            {
                System.out.println("The lcm of a and b is: "+lcm);
                break;
            }
            ++lcm;
        }

    }
}
