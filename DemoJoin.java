class MultiTh implements Runnable{
    String name;
    Thread t;
        MultiTh(String t_name)
        {
            name = t_name;
            t = new Thread(this, name);
            System.out.println("Child "+t);
            t.start();
        }
        @Override
        public void run(){
            try{
            for (int i=0; i<5; i++){
                System.out.println("Child "+name+" "+i);
                Thread.sleep(1000);
            }            
          }
          catch(InterruptedException e)
          {
                System.out.println("Child Interrupted");
          }
           System.out.println("Child "+name+" Ended");
        }
    }
class DemoJoin{
        public static void main(String[] args) {
            
            MultiTh ob1 = new MultiTh("ONE");
            MultiTh ob2 = new MultiTh("TWO");
            MultiTh ob3 = new MultiTh("Three");
            MultiTh ob4 = new MultiTh("Four");
            
            System.out.println("Thread One is Alive: "+ob1.t.isAlive());
            System.out.println("Thread two is Alive: "+ob2.t.isAlive());
            System.out.println("Thread three is Alive: "+ob3.t.isAlive());
            System.out.println("Thread four is Alive: "+ob4.t.isAlive());
           try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
            ob4.t.join();            
          }
          catch(InterruptedException e)
          {
                System.out.println("Parent Interrupted");
          }
          System.out.println("Parent Ended");
        }
}
