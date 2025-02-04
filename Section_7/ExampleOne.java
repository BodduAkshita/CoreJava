import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ExampleOne {
    public static void main(String[] args) {
        //C:\Users\akshi\Downloads\Java-Bootcamp-Resources-main (1)\Java-Bootcamp-Resources-main\Module 2 - Object Oriented Programming\10. Exception Handling\Lessons\checked-exceptions\greetings.txt
        try{
        FileInputStream fis = new FileInputStream("C:\\Users\\akshi\\OneDrive\\Desktop\\Section 7\\greetings.txt");
         Scanner scanner = new Scanner(fis);
         System.out.println(scanner.nextLine());
         scanner.close();
        }catch(FileNotFoundException exception){
            System.out.println(exception.getMessage());
        }
        finally
        {
            System.out.println("Process completed");
        }
    }
    
}