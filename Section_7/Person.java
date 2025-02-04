import java.util.Arrays;

public class Person {
    String name;
    String nationality;
    String dateOfBirth;
    String[] passport;
    int seatNumber;
    public Person(String name, String nationality, String dateOfBirth, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
        this.passport = new String[3];
    }
    public String[] getPAssport()
    {
        return Arrays.copyOf(passport, passport.length);
    }

    public String toString(){
         return "Name: " + this.name + "\n" + "Nationality: " + 
this.nationality + "\n" + "Date of Birth: " + 
this.dateOfBirth + "\n" + "Seat Number: " +
this.seatNumber + "\n" + "Passport: " + 
Arrays.toString(passport) + "\n";

    }
    
}
