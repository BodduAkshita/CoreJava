import java.util.HashMap;
import java.util.Map;
public class Hashmap {
    public static void main(String[] args) {

        HashMap<Integer, Employee> employeeMap = new HashMap<>();

        // Inserting elements to hashmap
        employeeMap.put(101, new Employee(101, "Cindrella", 50000));
        employeeMap.put(102, new Employee(102, "Snow White", 55000));
        employeeMap.put(103, new Employee(103, "Rapunzel", 60000));
        employeeMap.put(104, new Employee(104, "Jasmine", 45000));
        employeeMap.put(105, new Employee(105, "Ariel", 70000));

        // Entered a duplicate value
        employeeMap.put(103, new Employee(103, "Rapunzel", 60000));
        
        // Counting the no of employees
        System.out.println("Employees Count:");
        System.out.println(employeeMap.size());

        // Basic print operation
        System.out.println("\n" + employeeMap);

        // Printing All employees using iterator
        System.out.println("\nAll Employees:");
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Printing all employees using java lambda Biconsumer function
        System.out.println("\nAll Employees using lambda function:");
        employeeMap.forEach((key, value) -> {
            System.out.println(key + ": " +value);
        });

        // Checking if map is empty
        System.out.println("\nIs map empty? " + employeeMap.isEmpty());

        // Getting details of an employee
        System.out.println("\nDetails of Rapunzel: " + employeeMap.get(103));

        // Filtering employees with salary > 50000 using a loop
        System.out.println("\nEmployees with salary greater than 50000:");
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            if (entry.getValue().getSalary() > 50000) {
                System.out.println(entry.getValue());
            }
        }
        
        // Filtering employees with salary > 50000 using functional interface
        System.out.println("\nEmployees with salary greater than 50000 using filter:");
        employeeMap.entrySet()
        .stream()
        .filter(value -> {
            return value.getValue().getSalary() > 50000;
        })
        .forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            
        });

        
        // Giving a 10% salary increment to all employees using a loop
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            Employee emp = entry.getValue();
            employeeMap.put(entry.getKey(), new Employee(emp.getId(), emp.getName(), emp.getSalary()+(emp.getSalary() * 0.1)));
        }

        //Giving a 10% salary increment to all employees using a replace function
        // employeeMap.replaceAll((key, value) -> {
        //     return new Employee(value.getId(), value.getName(), value.getSalary() * 0.1);
        // });


        
        System.out.println("\nEmployees after 10% salary increment:");
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            System.out.println(entry.getValue());
        }
        employeeMap.entrySet().stream();
        // Removing employees with salary > 50000 using a loop
        Map<Integer, Employee> tempMap = new HashMap<>(employeeMap);
        for (Map.Entry<Integer, Employee> entry : tempMap.entrySet()) {
            if (entry.getValue().getSalary() > 50000) {
                employeeMap.remove(entry.getKey());
            }
        }

        // employeeMap.entrySet().removeIf(entry -> entry.getValue().getSalary() > 60000);

        System.out.println("\nEmployees after removing those with salary > 50000:");
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            System.out.println(entry.getValue());
        }

        System.out.println("\nContains key? " + employeeMap.containsKey(103));
        
    }
}
