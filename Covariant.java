class A
{
    A print()
    {
        System.out.println("Inside A");
        return this;
    }
}

class B extends A
{
    @Override
    B print()
    {
        System.out.println("Inside B");
        return this;
    }
}

class Covariant
{
    public static void main(String[] args) {
        B b = new B().print();
    }
}