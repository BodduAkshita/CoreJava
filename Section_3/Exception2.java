public class Exception2 {
    public static void main(String[] args) {

        String[] names = new String[7]; 
        names[0] = "John";
        names[1] = "Jim";
        names[2] = "Joe";

        for (String name : names) {
            if(name!=null){
                System.out.println(name.toUpperCase());
            }
        }
        
    }
}
