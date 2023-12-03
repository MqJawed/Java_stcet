class Box
{
    private double width;
    double height;
    double depth;
    
    Box(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }
    double volume()
    {
        return width*height*depth;
    }
}

class BoxW extends Box
{

    double weight;
    BoxW(double w, double h, double d, double m)
    {
        super(w,h,d);
        weight = m;
    }
     public static void main(String[] args) {
        
        BoxW b = new BoxW(2,3,4,5);

        double vol = b.volume();
        System.out.println(vol);
        // b.show();
        System.out.println(b.height);
    }
}
    


