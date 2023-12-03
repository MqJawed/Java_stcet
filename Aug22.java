abstract class Hello{
    int c;
    
    abstract void show();
    void display()
    {
        System.out.println("Abstract");
    }
}

class Hi extends Hello
{
    Hi(int a)
    {
        c=a;
    }
    @Override
    void show()
    {
        System.out.println("Overriden");
    }

}

class Point
{
    static int x1;
    static int y1;
    static int x2;
    static int y2;

    Point(int a, int b, int c, int d)
    {
        x1=a;
        y1=b;
        x2=c;
        y2=d;
    }
    static void dist()
    {
        double d = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
        System.out.println(d);
    }
}

class Aug22
{
    public static void main(String[] args) {
        // Hi h = new Hi();
        // h.show();
        // h.display();
        Point dis = new Point(3,4,4,5);
        Point.dist();

        Hi h = new Hi(5);
        System.out.println(h.c);
        

    }
}