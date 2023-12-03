class Exception3type {
    public static void main(String[] args) {
        try{
            int d = 2;
            int a = 4/d;
            int arr[] = {1,2,3,4};
            arr[4 - d] = 99;
            throw new NullPointerException("Demo");
        }
        catch(ArithmeticException e){
            System.out.println("Caught "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught "+e);
        }
        catch(NullPointerException e){
            System.out.println("Caught "+e);
        }
    }
}
