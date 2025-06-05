/**
 * Enum is a class which consist of named varibales and actually these varibales
 * are objects itself.
 * 
 * We can't extend enum with any other class apart from this everything is same as class.
 * 
 * So in our example we have taken a run enum class which is having by
 * default three objects that is
 * fast,faster,fastest;
 * 
 * Now in main we say "run obj = run.fast;" meaning create a reference of
 * run enum class which will point to the
 * object lets say run.fast .
 * 
 * Signifying enum class contains named objects.
 * 
 * Now we can simply use a switch case with these named objects or even a for
 * loop according to our needs.
 * 
 * A enum class by default extends enum class and therefore provides us with
 * methods like
 * EnumClassName.values() which returns all named object of that class in form
 * of an array.
 */

enum run{
    fast,faster,fastest;
}

public class SwitchEnum{
    public static void main(String[] args) {
        run obj = run.fast;
        switch (obj){
            case fast:
            System.out.println("ayush is fast");
            break;

            case faster:
            System.out.println("ayush is faster than everyone");
            break;

            case fastest:
            System.out.println("ayush is fastest in the world");
            break;

            default:
            System.out.println("everyone is faster than ayush");
            break;
        }

        run[] s = run.values();
        for (run status : s) {
            System.out.println(status);
        }
    }
}