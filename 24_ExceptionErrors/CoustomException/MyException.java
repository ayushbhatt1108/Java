class AyushException extends Exception{
    public AyushException( String str){
        super(str);
    }
}

public class MyException {
    public static void main(String[] args) {
        
        int i = 20;
        int j = 0;

        try{
            j = 18/i;
            if(j==0)
            throw new AyushException("man made exception");
        }
        catch (AyushException e){
            System.out.println("YAY we got you" + e);
        }
    }
    
}
