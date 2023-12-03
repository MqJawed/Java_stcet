class Test
{
    int x;
    int y;

    void change(int a, int b)
    {
        x = x+a;
        y = y+b;
    }
}

class Check
{
    public static void main(String[] args)
    {
        int a = 100;
        int prime = 1;
        for (a : 1000){
        for (int i = 2; i<=a/2; i++)
        {
            if (a%i == 0)
            {
                prime = 0;
                break;
            }
            else
                prime = 1;
            
        }
        if (prime == 1)
        {
            System.out.println(a);

        }

    }
}
}