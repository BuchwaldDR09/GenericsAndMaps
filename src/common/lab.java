
package common;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Dan
 */
public class lab {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Buchwald", "Daniel", "111-11-1111");
        Employee employee2 = new Employee(2, "Hammond-Knight", "Morgan", "222-22-2222");
        Employee employee3 = new Employee (1, "James", "Lucas", "111-11-1111");
        Employee employee4 = new Employee(3, "Lynn", "Hailey", "333-33-3333");
        
        Map<String, Employee> employees = new HashMap<>();        
        
        employees.put("Emp1", employee1);
        employees.put("Emp2", employee2);
        employees.put("Emp3", employee3);
        employees.put("Emp4", employee4);
        
        
        System.out.println("\nSorted:");
        Set keys = employees.keySet();
        for(Object key: keys){
            System.out.println(employees.get(key));
        }
        
        
        
        System.out.println("\n");
        

        //Tree Map
        Map<String,Employee> employees2 = new TreeMap<>();
        employees2.putAll(employees);
        
        //Iterationg through sorting automatically
        System.out.println("The Sorted TreeMap:");
        Set keys2 = employees2.keySet();
        for(Object key: keys2){
            System.out.println("Key: " + key);
            System.out.println(employees2.get(key));
            System.out.println("");
        }
   
        //TreeSet
        System.out.println("\nTree Set");
        Set<Employee> employeeSet = new TreeSet<>();
        employeeSet.add(employee4);
        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        
        for(Employee emp: employeeSet){
            System.out.println(emp);
        }
            
    }
}
