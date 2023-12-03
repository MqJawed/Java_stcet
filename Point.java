import java.util.Scanner;

class Point {
    static int x1, y1, x2, y2;

    static {

        System.out.println("Enter Values of X1 Y1 and X2 Y2");
        Scanner scanner = new Scanner(System.in);
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
    }

    static void dist() {
        double c = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between two point is " + c);
    }

    public static void main(String[] args) {

        dist();
    }
}