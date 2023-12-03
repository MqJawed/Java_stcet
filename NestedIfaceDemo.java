class A
{

    interface Nested
    {
        void display(int param);
    }
}

class NestedIfaceDemo implements A.Nested
{
    public void display (int data)
    {
        System.out.println("Data is "+data);
    }
    public static void main(String[] args) {
        A.Nested nif = new NestedIfaceDemo();
        nif.display(5);
    }
}