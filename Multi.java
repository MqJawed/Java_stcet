class Multi implements Runnable{
    String name;
        Multi(String t_name)
        {
            name = t_name;
            Thread t = new Thread(this, name);
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
        public static void main(String[] args) {
            
            new Multi("ONE");
            new Multi("TWO");
            
            
           try{
            for (int i=0; i<5; i++){
                System.out.println("Parent "+i);
                Thread.sleep(2000);
            }            
          }
          catch(InterruptedException e)
          {
                System.out.println("Parent Interrupted");
          }
          System.out.println("Parent Ended");
        }
}