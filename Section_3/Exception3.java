import java.util.Scanner;

public class Exception3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a random integer");
        if(scanner.hasNextInt())
        {
            scanner.nextInt();
        }
        else{
            scanner.nextLine();
        }
        scanner.close();
    }
    
}
