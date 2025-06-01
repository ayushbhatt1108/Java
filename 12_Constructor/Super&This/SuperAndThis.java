class A{
    public A(){
        super();
        System.out.println("in A");
    }
    public A(int n){
        super();
        System.out.println("in a int");
    }
}

class B extends A{
    public B(){
        super(5);
        System.out.println("in B");
    }
    public B(int n){
        this();
        System.out.println("in B int");
    }
}

public class SuperAndThis {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj);
    }
    
}
