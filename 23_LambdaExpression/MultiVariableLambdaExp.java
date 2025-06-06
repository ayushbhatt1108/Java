/**
 * Lambda expression can be only used with functional interfaces.
 * Since a functional interface will only have one public abstract method
 * decleration.
 * 
 * Thus one way of using this was to have a class which implemnts this interface
 * and thus provide a method definition
 * to this abstract method of X functional interface.
 * 
 * However another way is to use anonymous inner class which provides definition
 * to this abstract method of interface
 * for every object being created.
 * 
 * Now firstly when we have done
 * A obj = new A(){} i,e created an refernce obj of type A which will follow an
 * imprint that we will defined inside
 * our anonymnous inner class.
 * 
 * However since in functional interface we are pretty sure that there is only
 * one abstract method which is needed to be
 * defined thus we can us a new syntax termed as lambda expression.
 * 
 * This is demonstrated in A obj1 .
 */
@FunctionalInterface
interface A {
    int add(int i, int j)   ;
}

public class MultiVariableLambdaExp {
    
    public static void main(String[] args) {
        
        A obj = new A(){
            public int add(int i, int j){
                return i + j;
            }
        };
        System.out.println(obj.add(5,4));


       A obj1 = (i,j) -> i+j;     // lambda expression
       System.out.println(obj1.add(7, 9));
    }
}
