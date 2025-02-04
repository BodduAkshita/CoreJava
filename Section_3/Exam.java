import java.util.HashMap;

public class Exam {
    public static void main(String[] args) {

        HashMap<String, Student> examScore = new HashMap<>();
        examScore.put("Akshita", new Student("Akshita", 25));
        examScore.put("Bhavya", new Student("Bhavya", 30));
        examScore.put("Meena", new Student("Meena", 40));
        examScore.put("Riya", new Student("Riya", 35));
        examScore.put("Shreya", new Student("Shreya", 45));

        
        System.out.println("Size: " + examScore.size());

        System.out.println("Details of Akshita: " + examScore.get("Akshita"));

        System.out.println("Is map empty? " + examScore.isEmpty());

        System.out.println("Contains key 'Riya'? " + examScore.containsKey("Riya"));
        
        System.out.println("Contains value for 'Shreya'? " + examScore.containsValue(new Student("Shreya", 45)));

        // System.out.println("Employee Salary:");
        // examScore.forEach((key, value) -> {
        //     System.out.println(key.getName() + ": " + value.getScore());
        // });

        // System.out.println("\nStudents scoring more than 30:");
        // examScore.entrySet()
        //         .stream()
        //         .filter(entry -> {
        //             return entry.getValue() > 30;
        //         })
        //         .forEach(entry -> {
        //             System.out.println(entry.getKey() + ": " + entry.getValue());

        //         });
    }
}
