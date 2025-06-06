import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * finally is used to close any resource fo example br.close()
 * 
 * try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
 * in the above line we have created br object while exceuting try method itself which will result in automatic closing of resource 
 * by this way there is no need to mention finally statement for closing of resource
 * 
 * by the way closing of resource that we are using is necessary after usage as to avoid over load and over memory consumption on jvm
 * 
 */

public class TryWithResource {
    public static void main(String[] args) throws IOException {

        int num=0;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
        finally{
            System.out.println("hiii");
        }
        
    }
    
}
