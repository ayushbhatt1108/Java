/**
 * So in this case we wrote some critical code , code which can give some run
 * time exceptions.
 * Say we are dividing by 2 in the below case so it needs to be handled.
 * 
 * Moreover we are also trying to access an array Index which is not present in
 * an array , it leads to
 * index out of bound exception so we need to handle this as well.
 * 
 * So we hit line j=18/i surely it is not an execption so it  doesn't got catched in the catch
 * block of Airthmetic exception
 * 
 * now the porcess again start from next line that is arr[1], it is also not an exception so doesn't get caught in index out of bound exception
 * 
 * now the porcess again start from next line that is arr[5], it starts
 * after the catch block, which is sout statement at the last.
 * 
 * So for a same try block we can have multiple catch block however once a
 * critical code sends execption and once code is has reached the catch block that catch block will get executed and it will
 * not fall to other catch block
 * for the same try block.
 * 
 * However since now we have handled the exception thus code dont stop exceution
 * and moves to last line
 * of printing handled and working fine.
 * 
 * Now since all exceptions extends Exception class ex: Aithmetic exception
 * extends Exception class,
 * Array out of bound exception extends exception class.
 * So exception class is the parent and thus if we are unware that which child
 * class exception its currently is
 * thus we can go for a generic exception of Exception class which is byDefault
 * figure out that
 * this exception is falling under which exception category.
 */

public class HandlingException{
    public static void main(String[] args) {
        
        int i = 2;
        int j = 0;
        int nums[] = new int [5];

        try{
            j = 18/i;
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch (ArithmeticException e){
            System.out.println("calculation error");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Be in your limits");
        }
        catch (Exception e){
            System.out.println("pls handle krlo");
        }
        System.out.println(j);
        System.out.println("Koi farak ni pdta");
    }
}