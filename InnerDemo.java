class OuterClass
{
    static int outer_x = 8;
    int outer_y = 7;
    private static int outer_z= -21;

    class Inner
    {
        void display()
        {
            System.out.println("The Static int x value is "+outer_x+" and private static int z value is "+outer_z);
            System.out.println("The Non static Y value is "+outer_y);
            
        }
    }
}

class InnerDemo
{
    public static void main(String[] args) {
        OuterClass outer_objt = new OuterClass();
        OuterClass.Inner obj = outer_objt.new Inner();
        obj.display();
    }
}