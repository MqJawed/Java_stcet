interface InterINHERInter1{

    void meth1();
}

interface InterINHERInter2 extends InterINHERInter1{

    void meth2();
}

class TwoInterdemo implements InterINHERInter2{
    
    public void meth1()
    {
        System.out.println("Inside parent ");
    }

    public void meth2()
    {
        System.out.println("Inside child ");
    }
    public static void main(String[] args) {
        TwoInterdemo dem = new TwoInterdemo();
        dem.meth1();
        dem.meth2();
    }
}
