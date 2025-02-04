public class Variables
{
    public static void main(String[] args) {
        int passenger = 5;
        System.out.println(passenger);

        //wb 2.1
        int points = 0;

        System.out.println("Harry was caught wandering the halls. -50 points for Gryffindor");
        points -= 50;
        System.out.println("Harry was being cheeky in class. -3 points for Gryffindor");
        points -= 3;
        System.out.println("Hermione got full marks on Lockhart's quiz. 30 points for Gryffindor");
        points += 30;
        System.out.println("Ron won the underground chess game. 100 points for Gryffindor");
        points += 100;
        System.out.println("Harry defeated Quirrell. 60 points for Gryffindor");
        points += 60;
        System.out.println(points);

        //wb 2.2

        String name = "Sam";
        int age = 35;
        String country = "England";
        String sport = "Basketball";
        int hours = 1;
        String game = "Checkers";
        String subject = "Chemistry";
        char grade = 'B';

        System.out.println("My name is " + name + ". I'm " + age + " years old, and I'm from "+country+". ");
        System.out.println("My favourite sport is "+sport+". I play for "+hours+" hours a day");
        System.out.println("When I'm tired, I like to play "+ game+".");
        System.out.println("In school, my favourite subject was "+subject+", I scored a "+grade+".");

        //wb 2.3

        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;

        System.out.println("You picked 500 apples from an apple orchard");
        numOfApples += 500;
        
        System.out.println("Time for business! You're selling each apple for 40 cents");
        double price = 0.40;

        System.out.println("One customer walked in. He bought 4 apples!");
        numOfApples -= 4;
        numOfCustomers++;
        profit += 4*price;

        System.out.println("Another customer walked in. He bought 20 apples!");
        numOfApples -= 20;
        numOfCustomers++;
        profit += 20*price;

        System.out.println("Another customer walked in. She bought 200 apples!");
        numOfApples -= 200;
        numOfCustomers++;
        profit += 200*price;

        System.out.println("Wow! So far, you made: $" + profit);
        System.out.println(numOfCustomers + " customers love your apples.");
        System.out.println("You have " + numOfApples + " apples left. We'll sell more tomorrow!");


        //wb 2.4

        double sales = 24309.65; 
        double profit = 18562.18; 
        double refunds = 688.78; 
        double shipping = 1233.57; 

        System.out.println("This month, we made $"+ (int)sales+ " in sales");
        System.out.println("Factoring in costs, we made $"+(int)profit+" in profit");
        System.out.println("The refunds are at a low $"+(int)refunds+". This is a good sign!");
        System.out.println("Shipping costs were high. We paid $"+(int)shipping+" in shipping");


        //wb.2.5

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        
        System.out.println("What is your first name?");
        String firstName = scan.nextLine();

        System.out.println("What is your last name?");
        String lastName = scan.nextLine();

        System.out.println("How old are you?");
        int age = scan.nextInt();

        scan.nextLine();
        System.out.println("Make a username");  
        String userName = scan.nextLine();

        System.out.println("What city do you live in?");
        String city = scan.nextLine();

        System.out.println("What country is that?");
        String country = scan.nextLine();

        System.out.println("Thank you for joining JavaGram!");
        System.out.println("\nHere is the information you entered:");
        System.out.println("\tFirst Name: " +firstName);
        System.out.println("\tLast Name: " + lastName);
        System.out.println("\tAge: " + age);
        System.out.println("\tUsername: " + userName);
        System.out.println("\tCity: " + city);
        System.out.println("\tCountry: " + country);

        scan.close();
        
    }
}