class A extends Thread {
   //A a = new A();
//    a.start();
    public void run () {
        try {
           System.out.println("A start");
           Thread.sleep(1000); 
           System.out.println("A complete");

        } 
        catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}

class B extends Thread {
    
    B()
    {
        A a = new A();
        a.start();
    }
    //B b = new B();
    // b.start();
    public void run () {
        try {
            a.join();
            System.out.println("B start");
            Thread.sleep(1000); 
            System.out.println("B complete");

        } 
        catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}

class C extends Thread {
    C()
    {
        B b = new B();
        b.start();
    }
    public void run () {
        try {
            b.join();
            System.out.println("C start");
            Thread.sleep(1000); 
            System.out.println("C complete");

        } 
        catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}

public class JoinThread {
    public static void main(String[] args) throws InterruptedException {
        C c = new C();
        c.start();

        c.join();
        System.out.println("Main Complete");
    }
}