
public class Main{
    public static void main(String[] args) {

        Car[] cars = new Car[] {
            new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
            new Car("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
            new Car("Nissan", 5000, 2017, "yellow", new String[] {"tires", "filter"}),
            new Car("Honda", 7000, 2019, "orange", new String[] {"tires", "filter"}),
            new Car("Mercedes", 12000, 2015, "jet black", new String[] {"tires", "filter", "transmission"})
        };
        Dealership dealership = new Dealerdhip(cars);
        // String[] spareParts = new String[] {"Tires", "Keys"};
       // Car nissan = new Car("Nissan", 10000, 2020, "Green", new String[] {"Tires", "Keys"});
        //Car dodge = new Car("Dodge", 11000, 2019, "Blue", new String[] {"Tires", "Keys"});
        // String[] carParts = nissan.getParts();
        //Car nissan2 = new Car(nissan);
        // carParts[0] = "Filter";
        //System.out.println(nissan);
        // spareParts[0] = "Filter";
        //Car nissan2 = nissan;

        // nissan2.setColor("Yellow");
        // nissan.setColor("Orange");
        // nissan2.setColor("Blue");
        // nissan.setColor("Purple");
        // nissan2.setColor("Fuchsia");
        // nissan.setColor("Beige");

        //nissan2.setColor("Yellow");
       // nissan.setColor("JetBlack");

        // System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getMake() + 
        // ". It was built in " + nissan.getYear() + ". It is " + nissan.getYear() + ".\n");
        // System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getMake() + 
        // ". It was built in " + dodge.getYear() + ". It is " + dodge.getYear() + ".\n");


        //wb 7.1
        // Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);


        // System.out.println("Name: " + person.name + "\n" + "Nationality: " + person.nationality + "\n" + "Date of Birth: " + person.dateOfBirth + "\n" + "Seat Number: " + person.seatNumber + "\n");

        // Shirt nike = new Shirt("Nike", 20.99, "Small");
 
        // String brand = nike.getBrand();
        // brand = "woops, accidental update";
 
        // System.out.println("Brand: " + nike.getBrand());
        // System.out.println("Price: " + nike.getPrice());
        // System.out.println("Size: " + nike.getSize());
        // System.out.println(person);

    }
}