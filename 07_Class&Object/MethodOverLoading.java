class calculator{

    public int add (int n1, int n2){
        return n1+n2;
    }
    public double add(double n1, int n2){
        return n1+n2;
    }
    public int add (int n1,int n2 , int n3){
        return n1+n2+n3;
    }
    
}

public class MethodOverLoading {

    public static void main(String[] args) {
        
        calculator calc = new calculator();
        int r = calc.add(3,4,7);
        System.out.println(r);
    }
    
}


//Method overloading in Java is a feature that allows a class to have more than one method with the same name, as long as their parameter lists (type, number, or order of parameters) are different. It is a way to implement compile-time polymorphism.
//Key Concepts:
//Same Method Name:

//The overloaded methods must have the same name.

//Different Parameters:

//The methods must differ in:

//Number of parameters, or

//Type of parameters, or

//Order of parameters (if types are different)

//Return Type Can Be Same or Different:

//The return type alone is not sufficient to distinguish overloaded methods.

//Compile-Time Polymorphism:

//The method to be invoked is determined at compile time, not at runtime.