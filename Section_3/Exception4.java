public class Exception4 {
    public static void main(String[] args) { 
        try {
            int data=100/0; 
            
        }
        catch(ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            } 
    }
}



    