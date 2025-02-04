import java.util.*;
public class ForLoopExamples {

    public static void main(String[] args) {
        // Example 1: Print numbers from 1 to 10
        // TODO: Write a for loop that prints numbers from 1 to 10
        for(int i=1;i<=10;i++)
        {
            System.out.println(i); 
        }
        
        // Example 2: Print "Hello, world!" 5 times
        // TODO: Write a for loop that prints "Hello, world!" 5 times
        for(int i=0;i<5;i++)
        {
            System.out.println("Hello World!"); 
        }
        System.out.println();
        // Example 3: Print the multiplication table of 5 up to 10
        // TODO: Write a for loop that prints the multiplication table of 5 up to 10 (5 x 1, 5 x 2, ..., 5 x 10)
        for(int i=1;i<11;i++)
        {
            System.out.println(i*5);
        }
        System.out.println();
        // Example 4: Print the numbers from 10 to 1 in reverse order
        // TODO: Write a for loop that prints numbers from 10 to 1 in reverse order
        for(int i=10;i>0;i--)
        {
            System.out.println(i);
        }
        System.out.println();
        // Example 5: Print the first 10 even numbers
        // TODO: Write a for loop that prints the first 10 even numbers
        for(int i=0;i<=19;i++)
        {
            if(i%2==0)
            {
            System.out.println(i);
            }
        }
//wb1.
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+". If Java was easy, they would call it Python!");
        }
        //wb2.
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want me to write?");
        String string = scanner.nextLine();
        for(int i=0;i<99;i++)
        {
            System.out.println(i+ string);
        }

        //sdf
        //Scanner scanner = new Scanner(System.in);
        System.out.print("Which number do you want to enter?");
        int n = scanner.nextInt();
        System.out.println("Great here's how it's done");
        for(int i = 0; i<= n; i++)
        {
            System.out.print(i+" ");
        }
        scanner.close();
    }
}
