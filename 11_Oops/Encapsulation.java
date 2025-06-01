/**
 * Lets take an example of a human brain as it has some data may be his name,
 * some passwords etc.
 * Now an outside world should not directly look inside the brain, get the info
 * which it wants.
 * There has to be a mechanism taht someone should ask us for that data and its
 * upto us whether we want to share or not.
 * Lets suppose we want to share then we can speak it or write it or type it
 * which are the various methods by which we allow access.
 * 
 * Meaning binding the data/instance varibales with methods such that no outside
 * world can have direct access to them is called
 * encapsulation.
 * 
 * In order to achive encapsulation we made the instance varibles private
 * meaning there access is now limited to the methods of the same
 * class.Now we used some functions like get and set which will set them and
 * thus we cant access them
 * directly from outside classes and there is a mechanism to set or get their
 * values via some methods.
 * 
 * This is called encapsulation.
 * 
 */

class ayush{

    private int age = 18;
    private String name = "Ayush";

    public int getage(){
        return age;
    }
    public String getname(){
        return name;
    }
    public void setage(int a){
        age = a;
    }
    public void setname(String n){
        name = n;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        ayush obj = new ayush();
        obj.setage(26);
        obj.setname("Gaurav");
        System.out.println(obj.getage() + ":" + obj.getname());
    }
}
