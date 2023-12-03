class OuterClass
{
    static int outer_x = 8;
    int outer_y = 7;
    private static int outer_z= -21;

    static class Nested
    {
        OuterClass obj = new OuterClass();
        void display()
        {
            System.out.println("The Static int x value is "+outer_x+" and private static int z value is "+outer_z);
            System.out.println("The Non static Y value is "+obj.outer_y);
            
        }
    }
}

class NestedDemo
{
    public static void main(String[] args) {
        OuterClass.Nested objt = new OuterClass.Nested();
        objt.display();
    }
}