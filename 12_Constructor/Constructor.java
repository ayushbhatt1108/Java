class Ayush {
    private String name;
    private int age;

    public Ayush() {}

    public Ayush(String name) {
        this.name = name;
    }

    public Ayush(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Ayush obj = new Ayush("GAURAV");  // Fixed constructor call
        Ayush obj1 = new Ayush("Ayush");  // Fixed constructor call

        System.out.println(obj.getName());
        System.out.println(obj1.getName());
    }
}