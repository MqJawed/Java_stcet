import java.io.IOException;

class MethodNested {
    static void meth(){
        try{
            throw new IOException();
        }
        catch(IOException e){
            System.out.println("Caught "+e);
        }
    }
   public static void main(String[] args) {
    try{
        meth();
        throw new InterruptedException();
    }
    catch(InterruptedException e){
        System.out.println("Caught "+e);
    }
   } 
}
