public class AskJava {
    public static void main(String[] args) {
        //wb 3.1
        double change = 3.50;
        double price = 2.50;
        System.out.println("Me: Hi Java, do I have enough change to buy chips?");
        System.out.println("Java: " + (change >= price) + "\n");

        int capacity = 12;
        int people = 15;
        System.out.println("Me: Hi Java, can the elevator hold everyone?");
        System.out.println("Java: " + (capacity >= people)+ "\n");

        String request = "PS5";
        String purchase = "Toy car";
        System.out.println("Me: Hi Java, will my friend be happy?");
        System.out.println("Java: " + (request.equals(purchase)) + "\n");

        int space = 9;
        int guests = 8;
        System.out.println("Me: Hi Java, can everyone attend my dinner party?");
        System.out.println("Java: " + (space >= guests) + "\n");

        int yourVotes = 24;
        int competitorVotes = 43;
        System.out.println("Me: Hi Java, will I win the election?");
        System.out.println("Java: " + (yourVotes > competitorVotes) + "\n");


        //wb 3.2
        double wallet = 100;
        
        double toyCar = 5.99;
        System.out.println("Can I get this car?");
        if (wallet >= toyCar) {
            System.out.println("Sure!\n");
            wallet -= toyCar;
        } else {
            System.out.println("Sorry, I only have " + wallet + " left");
        }

        double nike = 95.99;  
        System.out.println("Can I get these nike shoes?");
        if (wallet >= nike) {
            System.out.println("Sure!\n");
            wallet -= nike;
        } else {
            System.out.println("Sorry, I only have " + wallet + " left");
        }

        //wb 3.3
        int gryffindor = 100;    
        int ravenclaw = 500;   

        int pointsMargin = gryffindor-ravenclaw;
        
        if (pointsMargin >= 300) {
            System.out.println("Gryffindor are the champions");
        } else if (pointsMargin >= 0) {
            System.out.println("Gryffindor is in second place");
        } else if (pointsMargin >= -100) {
            System.out.println("Gryffindor is in third place");
        } else {
            System.out.println("Gryffindor is in fourth place");
        }

        //wb 3.4

        int temp = 25;

        String forecast;
        if (temp <= -1) {
            forecast = "The forecast is FREEZING! Stay home!";
        } else if (temp <= 10) {
            forecast = "The forecast is Chilly. Wear a coat!";
        } else {
            forecast = "It's warm. go outside!";  
        }

        System.out.println(forecast);

        //wb 3.5

        int day = 3;  
        boolean holiday = true;

        if (holiday) {
            System.out.println("woohoo, no work!");
        } else if (day == 6 || day == 7) {
            System.out.println("it's the weekend, no work!");
        } else {
            System.out.println("Wake up at 7:00 :(");
        }

        //wb 3.6

        String weekDay = "Friday"; 
        System.out.println("Hey, are you free on " + weekDay + "? \n");
        System.out.println("Hmm, let me check my calendar.");
        
    }
}
