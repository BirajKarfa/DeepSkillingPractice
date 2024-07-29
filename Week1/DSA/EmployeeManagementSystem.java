/*
Array Representation:
    Arrays are a linear data structure that store elements in contiguous memory locations.
    Each element in the array can be accessed using its index, which provides constant-time 
    access (O(1)). Arrays are efficient for storing and accessing data, but they have a 
    fixed size, which means the size must be known at compile time.

Advantages:
1. Fast access to elements using indices.
2. Efficient memory usage due to contiguous storage.
3. Simple and easy to use.
*/

//Implementation

class Employee {
    int employeeId;
    String name;
    String position;
    double salary;

    public Employee(int employeeId, String name, String position, double salary) {
        this.employeeId =employeeId;
        this.name =name;
        this.position =position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee(" + employeeId + ", " + name + ", " + position + ", " + salary + ")";
    }
}

public class EmployeeManagementSystem {
    private Employee[] employees;
    private int count;

    public EmployeeManagementSystem(int size) {
        employees =new Employee[size];
        count = 0;
    }

    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count++]= employee;
        } else {
            System.out.println("Array is full. Cannot add more employees.");
        }
    }

    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i< count;i++) {
            if (employees[i].employeeId== employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverseEmployees() {
        for (int i=0;i< count; i++) {
            System.out.println(employees[i]);
        }
    }

    public void deleteEmployee(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId==employeeId) {
                employees[i]=employees[--count];
                employees[count] = null;
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(5);
        ems.addEmployee(new Employee(1, "Jit", "Manager", 75000));
        ems.addEmployee(new Employee(2, "Sneha", "Developer", 60000));
        ems.addEmployee(new Employee(3, "Rahul", "MarketingExpert", 50000));

        System.out.println("All Employees:");
        ems.traverseEmployees();

        System.out.println("Search Employee with ID 2:");
        System.out.println(ems.searchEmployee(2));

        System.out.println("Delete Employee with ID 2:");
        ems.deleteEmployee(2);

        System.out.println("All Employees after deletion:");
        ems.traverseEmployees();
    }
}

/*
Time Complexity Analysis:
1. Add: O(1)
2. Search: O(n)
3. Traverse: O(n)
4. Delete: O(n)

Limitations of Arrays:
1. Fixed size: Cannot dynamically resize.
2. Inefficient for insertions and deletions: Requires shifting elements.
3. Not suitable for large datasets if the size is not known in advance.

When to use Arrays:
1. When the size of the dataset is known and fixed.
2. When fast access to elements is required.
*/

