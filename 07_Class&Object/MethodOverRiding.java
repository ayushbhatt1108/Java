/**
 * Method Overriding means a child class provides its own version of a method that is already defined in its parent class.
   The method name, return type, and parameters must be the same.
   It is used to change the behavior of the parent class method.

*The A class has a method add().
 The B class which also has a method add() with different return type overrides add() method of parent class A to provide its own version.
 Even though B inherits from A, it changes the behavior of add().


 */

 class A{
    public int add(int n1,int n2){
        return n1+n2;
    }
 }
 class B extends A{
    public int add(int n1, int n2){
        return n1+n2+2;
    }
 }
 public class MethodOverRiding{
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.add(1,2));
    }
 }