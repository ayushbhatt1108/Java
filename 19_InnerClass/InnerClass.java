/**
 * Lets suppose we have a class A and its simply a concrete class (A class whose
 * object we can create)
 * 
 * Now just like a normal class class A has a instance varibale (name) and a
 * public void show method
 * 
 * However it also have another class B inside of it and this class B is known
 * as inner class.
 * 
 * Now this inner class is having a show2 method.
 * 
 * Lets understand how we can access this innser class method show2.
 * 
 * So first we create a object of A which is :
 * A obj = new A();
 * now we need to create an object of this innser class B , the type of refernce
 * variable will simply be A.B so we say
 * 
 * A.B obj1 = obj.new B();
 * 
 * Now in the right side the reason that we said obj.new B() is because
 * eventually B is innser to A and thus in oder to access
 * it we need the object of A which is obj so we say
 * 
 * obj.new B() and thus it will create a new object of this inner class and thus
 * we can access this show2() method using
 * this obj1.
 */

class A{
    public void show(){
        System.out.println("in show");
    }

    class B{
        public void show2(){
            System.out.println("in show 2");
        }  
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        A.B obj1 = obj.new B();
        obj1.show2();
    }
    
}
