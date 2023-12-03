class A
{
    private int i;

}

class B extends A
{
    int i;
    int j;
    B(int a, int b)
    {
        super.i = a;
        j = b;
    }
    void show()
    {
        
        System.out.println(i);
        System.out.println(j);
    }
}

class Demo
{
    public static void main(String[] args) {
        
        B b = new B(2,3);
        A p = new A();
        System.out.println(p.i);
        
    }
}