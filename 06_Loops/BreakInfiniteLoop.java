public class BreakInfiniteLoop {


    public static void main(String[] args) {
        int count = 0;

        while (true) {
            System.out.println("Count: " + count);
            count++;

            if (count == 5) {
                break; // Exit the loop when count is 5
            }
        }
    }
}


