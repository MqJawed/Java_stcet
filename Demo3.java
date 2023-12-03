class A 
{
    int i;
    
}

class B extends A
{
    int i,j;
    B(int a, int b)
    {
        super.i = a;
        i = a;
        j = b;
    }
}

class Demo3
{
    public static void main(String[] args) {
        B b = new B(2,3);
        A a = new A();
        System.out.println(b.i);
        System.out.println(b.j);
        System.out.println(b.i);
    }
}