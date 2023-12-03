import java.util.Scanner;

class Complex {
    // static int count = 2;
    int x;
    int y;

    Complex() {

    }

    Complex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println(x + " + " + y + "i");
    }

    static void sumt(Complex a, Complex b) {

        Complex c = new Complex();
        c.x = a.x + b.x;
        c.y = a.y + b.y;
        System.out.print("The sum is ");
        c.display();

    }

    static void difft(Complex a, Complex b) {

        Complex c = new Complex();
        c.x = a.x - b.x;
        c.y = a.y - b.y;
        System.out.print("The difference is ");
        c.display();

    }

    static void prodt(Complex a, Complex b) {

        Complex c = new Complex();
        c.x = (a.x * b.x) - (a.y * b.y);
        c.y = (a.x * b.y) + (a.y * b.x);
        System.out.print("The multiplication is ");
        c.display();
    }

    void complt() {
        y = -y;
        System.out.print("The complement of a is ");
        display();
    }

    void modt() {
        double mod = Math.sqrt((x * x + y * y));
        System.out.print("The modulus of a is " + mod);
    }

    public static void main(String[] args) {

        System.out.println("Enter coefficient of x1,x2,y1,y2 ");
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        Complex a = new Complex(x1, y1);
        Complex b = new Complex(x2, y2);
        a.display();
        b.display();
        sumt(a, b);
        difft(a, b);
        prodt(a, b);
        a.complt();
        a.modt();
    }
}