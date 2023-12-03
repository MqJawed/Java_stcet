class Mulinherit extends A implements B {

    @Override
    public void dis()
    {
        System.out.println("Inside Interface");
    }
    public static void main(String[] args) {
        Mulinherit mul = new Mulinherit();
        mul.dis();
        mul.disA();
    }   
}
