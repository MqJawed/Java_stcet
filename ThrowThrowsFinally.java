import java.io.IOException;

class ThrowThrowsFinally {
    static void demoEx() throws IOException
    {
        throw new IOException("Demo");
    }
    public static void main(String[] args) {
        try{
            throw new NullPointerException();
        }
        catch(NullPointerException e){
            System.out.println("Caught "+e);
        }
        try{
            demoEx();
        }
        catch(IOException e){
            System.out.println("Caught "+e);
        }
        finally{
            System.out.println("Inside Finally");
        }
    }
}

