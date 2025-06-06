/**
 * Throw keyword is used to call the catch block on our own, lets suppose we
 * ourselves intend to
 * throw a error and call the catch block then we use throw keyword.
 * 
 * We can throw a exception of deafult types like that of Exception class or may
 * be an airthmetic class
 * or even we can create our own exception class as depicted in
 * CustomOwnException folder.
 */

public class ThrowKeyword {

    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try{
            j = 18/i;
            if ( j == 0)
                throw new ArithmeticException();  
        }   
        catch ( ArithmeticException e){
            System.out.println(" hehe error occured");
        }
        catch ( Exception e){
            System.out.println(" Here we go again ");
        } 
}
}
