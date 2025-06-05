interface A{
    void show();
    void config();
}

class B implements A{

    public void show() {
        // TODO Auto-generated method stub
        System.out.println("Unimplemented method 'show'");
    }

    public void config() {
        // TODO Auto-generated method stub
        System.out.println("Unimplemented method 'config'");
    }
    
}
public class Interface{
    public static void main(String[] args) {
        
        A obj = new B();
        obj.show();
        obj.config();
    }
}