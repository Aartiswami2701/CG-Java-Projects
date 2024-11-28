package mock;
import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name;
    }

    // Override equals and hashCode for removing duplicates based on employee name
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

class EmployeeProcessor {

    // Method to process the list: remove duplicates and sort by name
    public List<Employee> processEmployees(List<Employee> employees) {
        // Remove duplicates (based on name) by using a HashSet, and then convert it back to a List
        Set<Employee> uniqueEmployees = new HashSet<>(employees);
        
        // Sort employees by name
        List<Employee> sortedEmployees = uniqueEmployees.stream()
                                                        .sorted(Comparator.comparing(Employee::getName))
                                                        .collect(Collectors.toList());
        return sortedEmployees;
    }

    // Method to group employees by salary range
    public Map<String, List<Employee>> groupBySalaryRange(List<Employee> employees) {
        Map<String, List<Employee>> groupedEmployees = new HashMap<>();
        
        // Group employees by salary range
        for (Employee employee : employees) {
            String range;
            if (employee.getSalary() < 30000) {
                range = "<30K";
            } else if (employee.getSalary() <= 50000) {
                range = "30K-50K";
            } else {
                range = ">50K";
            }
            
            groupedEmployees.computeIfAbsent(range, k -> new ArrayList<>()).add(employee);
        }
        
        return groupedEmployees;
    }

    // Method to find the employee with the highest salary in each range
    public Map<String, Employee> findHighestSalaryInEachRange(Map<String, List<Employee>> groupedEmployees) {
        Map<String, Employee> highestSalaryEmployees = new HashMap<>();
        
        // Find the employee with the highest salary in each salary range
        for (Map.Entry<String, List<Employee>> entry : groupedEmployees.entrySet()) {
            String range = entry.getKey();
            List<Employee> employeesInRange = entry.getValue();
            
            Employee highestSalaryEmployee = employeesInRange.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElseThrow(NoSuchElementException::new);
            
            highestSalaryEmployees.put(range, highestSalaryEmployee);
        }
        
        return highestSalaryEmployees;
    }

    // Method to calculate the average salary of all employees
    public double calculateAverageSalary(List<Employee> employees) {
        return employees.stream()
                        .mapToDouble(Employee::getSalary)
                        .average()
                        .orElse(0.0);
    }
}

public class Main4 {
    public static void main(String[] args) {
        // Sample input list of employees
        List<Employee> employees = Arrays.asList(
            new Employee("Rohit", 45000),
            new Employee("Anita", 55000),
            new Employee("Suresh", 28000),
            new Employee("Rohit", 45000),
            new Employee("Priya", 35000),
            new Employee("Anita", 60000),
            new Employee("Kumar", 52000)
        );

        EmployeeProcessor processor = new EmployeeProcessor();

        // Process employees (remove duplicates and sort by name)
        List<Employee> processedEmployees = processor.processEmployees(employees);
        System.out.println("Processed Employees: " + processedEmployees);

        // Group employees by salary range
        Map<String, List<Employee>> groupedEmployees = processor.groupBySalaryRange(processedEmployees);
        System.out.println("Grouped Employees by Salary Range: " + groupedEmployees);

        // Find the highest salary in each range
        Map<String, Employee> highestSalaryInRange = processor.findHighestSalaryInEachRange(groupedEmployees);
        System.out.println("Highest Salary in Each Range: " + highestSalaryInRange);

        // Calculate the average salary
        double averageSalary = processor.calculateAverageSalary(processedEmployees);
        System.out.printf("Average Salary: %.2f%n", averageSalary);
    }
}

//Question 4:
//
//The HR department at Capgemini wants to analyze employee data for better insights. They have
//
//provided a list of employees with their names and salaries. The task is to write a Java program that
//
//performs the following:
//
//1. Accept a list of employees as input. Each employee has a name and a salary.
//
//2. Remove duplicate employees based on names.
//
//3. Sort the employees by their names alphabetically.
//
//4. Group employees by their salary ranges (e.g., <30K, 30K-50K, >50K).
//
//5. Find the employee with the highest salary in each salary range and return their names.
//
//6. Calculate the average salary of all employees and return the result.
//
//Specifications:
//
//Task:
//
//1. Class Definitions:
//
//Class Employee:
//
//• Class Variables:
//
//o String name
//
//o double salary
//
//• Constructor:
//
//o Employee(String name, double salary): Initializes the employee with the given name
//
//and salary.
//
//Class EmployeeProcessor:
//
//• Implement the following methods for this class:
//
//o List<Employee> processEmployees(List<Employee> employees): This method takes a
//
//list of employees, removes duplicates, sorts them by name, and returns the
//
//processed list.
//
//▪ Visibility: public
//
//▪ Return Type: List<Employee>
//
//o Map<String, List<Employee>> groupBySalaryRange(List<Employee> employees): This
//
//method takes a list of employees and groups them by salary ranges: "<30K", "30K-
//
//50K", ">50K".
//
//▪ Visibility: public
//
//▪ Return Type: Map<String, List<Employee>>
//
//o Map<String, Employee> findHighestSalaryInEachRange(Map<String,
//
//List<Employee>> groupedEmployees): This method takes a map of grouped
//
//employees and finds the employee with the highest salary in each range.
//
//▪ Visibility: public
//
//▪ Return Type: Map<String, Employee>
//
//o double calculateAverageSalary(List<Employee> employees): This method takes a list
//
//of employees and calculates the average salary.
//
//▪ Visibility: public
//
//▪ Return Type: double
//
//Sample Input
//
//List<Employee> employees = Arrays.asList(
//
//new Employee("Rohit", 45000),
//
//new Employee("Anita", 55000),
//
//new Employee("Suresh", 28000),
//
//new Employee("Rohit", 45000),
//
//new Employee("Priya", 35000),
//
//new Employee("Anita", 60000),
//
//new Employee("Kumar", 52000)
//
//);
//
//Sample Output
//
//Processed Employees: [Anita, Kumar, Priya, Rohit, Suresh]
//
//Grouped Employees by Salary Range: {<30K=[Suresh], 30K-50K=[Priya, Rohit], >50K=[Anita,
//
//Kumar]}
//
//Highest Salary in Each Range: {<30K=Suresh, 30K-50K=Rohit, >50K=Anita}
//
//Average Salary: 47142.86