class Nested2type {
    public static void main(String[] args) {
        try{
            int d = 2;
            int a = 4/d;
            try{
                int arr[] = {4,5};
                arr[d] = 55;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Caught Inner "+e);
            }
        }
        catch(ArithmeticException e){
            System.out.println("Caught Outer "+e);
        }
    }
}