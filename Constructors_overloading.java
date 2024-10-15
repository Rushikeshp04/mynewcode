public class Constructors_overloading {

    // Constructor with int parameter
    Constructors_overloading(int a) {
        System.out.println("int data type");
    }

    // Constructor with boolean parameter
    Constructors_overloading(boolean b) {
        System.out.println("boolean data type");
    }

    // Constructor with char parameter
    Constructors_overloading(char c) {
        System.out.println("char data type");
    }

    // Constructor with String parameter
    Constructors_overloading(String data) {
        System.out.println("String data type");
    }

    // Main method
    public static void main(String[] args) {
        // Creating objects with different data types
        new Constructors_overloading("data");
        new Constructors_overloading('e');
        new Constructors_overloading(true);
    }
}
