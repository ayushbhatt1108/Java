/**
 * A functional inteface is a special kind of interface and the only main
 * difference is that a functional
 * interface allows only one public abstract method decleration
 * 
 * unlike a interface which can have any number of public abstract method
 * decleartions
 * 
 * A functional interface however can have any number of static final varibales just like normal interface.
 */

@FunctionalInterface
interface A{
    void show();
}
class B implements A{

    @Override
    public void show() {
        System.out.println("Show B");
    } 
}

public class FunctionalInterfaces {
    public static void main(String[] args) {
         // A obj = new B();      // refrence A but object of class B 
         // obj.show();

         //  OR

         // A obj = new A ()
        //  {                                                    //anonymous inner class method
         //       public void show(){
         //
         //           System.out.println("in B");
          //      }
        
            };
    }
    

