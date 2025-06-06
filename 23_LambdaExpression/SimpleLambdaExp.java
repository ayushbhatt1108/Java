@FunctionalInterface
interface A{
    void show(int i);
}

public class SimpleLambdaExp {
    public static void main(String[] args) {
        
        A obj = i ->   // Lambda expression
        System.out.println("LAMBDA" + ":" + i);
        obj.show(5);
    }

    
}
