import java.util.Scanner;
class Swap
{
    static void swapp(int a, int b)
    {
        int temp;
        temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        int a =5;
        int b = 6;
        int temp;
        System.out.printf("Before swap a=%d, b=%d", a,b);
    
        swapp(a,b);
        System.out.printf("After swap a=%d, b=%d",a,b);

    }
}