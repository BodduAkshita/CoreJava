import java.util.Arrays;

public class Car {
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;



    public Car(String make, double price, int year, String color,String[] parts){
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public Car(Car source){
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    public void setMake(String make) {
        this.make = make;
        
    }
    public void setPrice(double price) {
        this.price = price;
        
    }
    public void setColor(int year) {
        this.year = year;
        
    }
    public void setColor(String color) {
        this.color = color;
        
    }

    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String[] getParts() {
        return Arrays.copyOf(parts, parts.length);
    }

    public void setParts(String[] parts) {
        this.parts = Arrays.copyOf(parts,parts.length);
    }
    public String toString(){
        return "Make: " + this.make + ".\n" 
        +  "Price: " + this.price + ".\n"
        +  "Year: " + this.year + ".\n"
        +  "Color: " + this.color + ".\n"
        +  "Parts: " + Arrays.toString(parts) + ".\n";

    }
    
    
   
    
}
