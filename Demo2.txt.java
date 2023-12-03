class Test
{
    int a;
    char c;
    Test method()
    {
        Test temp = new Test();
        temp.a = 5;
        temp.c = 'R';
        return temp;
    }
}

class Demo
{
    public static void main(String[] args) {
        
        Test test = new Test();
        test = test.method();

        System.out.printf("The instance of returned object is %d & %c",test.a,test.c);

    }
}