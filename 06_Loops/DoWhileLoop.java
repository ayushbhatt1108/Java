//A do-while loop in Java is similar to a while loop, but it always executes the block of code at least once, because the condition is checked after the block is executed.
//Syntax:

//do {
    // code to be executed
//} while (condition);
//✅ Notice that the semicolon ; is required after the while (condition) in a do-while loop.

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println("i = " + i);
            i++;
        } while (i <= 5);
    }
}


