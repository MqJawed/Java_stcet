class MyException extends Exception
{
    int a;
    public String toString()
    {
        return "MyException["+a+"]";
    }
    static void compute() throws MyException
    {
        throw new MyException();
    }
    public static void main(String[] args) {
        try{
            compute();
        }
        catch(MyException e)
        {
            System.out.println(e);
        }
    }
}