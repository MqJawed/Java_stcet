class Room
{
    double length;
    double breadth;
    double height;
    Room(double l, double b, double h)
    {
    length=l;
    breadth=b;
    height=h;
    }
    double areacal()
    {
        return length*breadth;
        
    }
    void display()
    {
        System.out.println("The area of bedroom is "+this.areacal());
    }

}

class Bedroom extends Room
{
    Bedroom(double length, double breadth, double height)
    {
        super(length,breadth, height);
    }

    @Override
    void display()
    {
        System.out.println("This is Bedroom whose area is "+areacal()+" and has attached bathroom study table and night lamp");
    }

}

class Drawingroom extends Room
{
    Drawingroom(double length, double breadth, double height)
    {
        super(length,breadth,height);
    }

    @Override
    void display()
    {
        System.out.println("This is Drawingroom whose area is "+this.areacal()+" and has sofa, wall cabinet");
    }
   
}

class RoomsDemo
{
    public static void main(String[] args) {
        
        Room room = new Room(30,50,30);
        room.display();
        Bedroom bedroom = new Bedroom(20,40,30);
        bedroom.display();
        Drawingroom drawingroom = new Drawingroom(10,10,30);
        drawingroom.display();
    }
}