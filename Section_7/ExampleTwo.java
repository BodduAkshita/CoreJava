import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ExampleTwo {
    public static void main(String[] args) {
        try{
        readFile("C:\\Users\\akshi\\OneDrive\\Desktop\\Section 7\\greetings.txt");
        }catch(FileNotFoundException exception){
            System.out.println(exception.getMessage());
        }
        finally
        {
            System.out.println("Process completed");
        }
    }
    
    public static void readFile(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("C:\\Users\\akshi\\OneDrive\\Desktop\\Section 7\\greetings.txt");
        Scanner scanner = new Scanner(fis);
        System.out.println(scanner.nextLine());
        scanner.close();
    }
}