package miniproject.org.secondyearproject;

import java.util.List;

public  interface  Employeeservice {
     String createEmployee(Employee employee) ;
     List<Employee> readEmployee();
     boolean deleteEmployee(long Id);
     
}
