import java.util.*;
public class ArrayLoopExamples {

    public static void main(String[] args) {
        // Example 1: Print the elements of an integer array using a for loop
         int[] numbers = {22, 24, 26, 29, 30};
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
        // TODO: Use a for loop to print each element of the intArray
        

        // Example 2: Print the elements of a string array using a for loop
        String[] strArray = {"apple", "banana", "cherry"};
        // TODO: Use a for loop to print each element of the strArray

        for (String string : strArray) {
           System.out.println(string); 
        }
        // Example 3: Print every second element of an integer array
        int[] grades = {95, 80, 85, 70, 90, 60, 88, 78};
        // TODO: Use a for loop to print every second element of the grades array (step size of 2)

        for (int i = 0; i < grades.length; i+=2) {
            System.out.println(grades[i]);
        }
        // Example 4: Double the elements of an integer array
        int[] values = {3, 5, 7, 9, 11};
        // TODO: Use a for loop to double each element in the values array

        for (int i = 0; i < values.length; i++) {
            values[i] = values[i] * 2;
            System.out.println(values[i]);

            
        }
        // Example 5: Capitalize the elements of a string array
        String[] colors = {"red", "green", "blue"};
        for (int index = 0; index < colors.length; index++) {
            colors[index]=colors[index].toUpperCase();
            System.out.println(colors[index]);
        }
        // TODO: Use a for loop to capitalize each element in the colors array

        // Example 6: Find the index of a specific value in an integer array
        int[] data = {4, 7, 4, 1, 4, 9, 4};
        int targetValue = 4;
        for (int i = 0; i < data.length; i++) {
           if (data[i] == targetValue){
                System.out.println(i);
           } 
        }
        // TODO: Use a for loop to find the index of targetValue in the data array

        //wb 6.2
        String[] students = {"Malfoy", "Crabbe", "Goyle", "Pansy", "Dean"};
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]+" you will take seat "+i);
        }

        //wb 6.3
        String[] fruits = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("\nDo you sell coffee?");
        for (int i = 0; i < fruits.length; i++) {
            if(fruits[i] == "coffee"){
                System.out.println("\nWe have that in aisle: "+i);
                break;
            }
        }

        //wb 6.4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Java Grocers.");
        System.out.println("What can I help you find?");
        String list = scanner.nextLine();
        String[] menu = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        for (int i = 0; i < menu.length; i++) {
            if(menu[i].equals(list)){
                System.out.println("\nWe have that in aisle: "+i);
                break;
            }
        }
        
        //wb 6.5
       int[] scores = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};
       int highScore=0;
       System.out.println("Here are the scores");
       for (int i = 0; i < scores.length; i++) {
        System.out.print(scores[i]+" ");
       }
       System.out.println();
       for (int i = 0; i < scores.length; i++) {
        if(scores[i] > highScore){
            highScore = scores[i];
        }
       }
       System.out.println("HighScore: "+highScore);

       double[] price = {1.99, 2.99, 3.99, 4.99};
       double[] afterTax = new double[4];

       for (int i = 0; i < price.length; i++) {
        afterTax[i] = price[i] + (13 * price[i]) / 100;
        
       }
       String originalPrice=Arrays.toString(price);
       System.out.println("The original prices are: "+originalPrice);
       String result = Arrays.toString(afterTax);
       System.out.println("The aftertax prices are: "+result);

       //wb 6.10
       int numToppings = scanner.nextInt();
       scanner.nextLine();
       String[] toppings = new String[numToppings];
       for (int i = 1; i <= numToppings; i++) {
        System.out.print(i+". ");
        toppings[i] = scanner.next();
       }
       
       scanner.close();
    }
    public static int randomNumber()
    {
        double decimal = Math.random() * 50000;
        return (int)decimal;
    }
    public static double[] celciusToFahrenheit(double[] celcius)
    {
        double[] farenheit = new double[celcius.length];
        for (int i = 0; i < farenheit.length; i++) {
            farenheit[i] = (celcius[i] / 5*9)+32;
        }
        return farenheit;

    }
        
}
