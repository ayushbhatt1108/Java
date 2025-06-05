interface Computer{
    void code();
}

class Laptop implements Computer{

    @Override
    public void code() {
        // TODO Auto-generated method stub
        System.out.println("laptop");    }
    
}

class Desktop implements Computer{

    @Override
    public void code() {
        // TODO Auto-generated method stub
        System.out.println("Desktop");
    }
    
}

class Developer{
    public void devapp(Computer lap){
        lap.code();   
    }
}

public class Need{
    public static void main(String[] args) {
        
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer ayush = new Developer();
        ayush.devapp(desk);
        ayush.devapp(lap);
    }
}