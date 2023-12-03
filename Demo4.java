class A
{
    A()
    {
        
    }
    A(int i)
    {

    }
}

class B extends A
{
    B()
    {

    }
    
    B(int j)
    {

    }
}

class C extends B
{
    C()
    {
        System.out.println("Inside c");
    }
}

class Demo4
{
    public static void main(String[] args) {
        C c = new C();
    }
}