package exception;

public class ExceptionHandlingWithTryCatch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try{
            // we are trying to divide a number by zero
            // which leads to an exception, and this is an example of checked exception
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
