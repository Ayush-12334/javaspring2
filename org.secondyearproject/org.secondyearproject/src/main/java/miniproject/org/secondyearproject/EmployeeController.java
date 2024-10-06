package miniproject.org.secondyearproject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
   // Employeeservice employeeService=new EmployeeserviceImpl();
    List<Employee> employees =new ArrayList<>();
   @Autowired 
    
   
   
     private  Employeeservice employeeService;

    @GetMapping("employee")
    public List<Employee>getAllEmployees(){
      

        return employeeService.readEmployee();

    }
    @PostMapping("employee")
    public String createEmployee(@RequestBody Employee employee) {
        employees.add(employee);
         return employeeService.createEmployee(employee);
        
    }
    @DeleteMapping("employee/{Id}")
    public String deleterEmployee(@PathVariable Long Id){
       if( employeeService.deleteEmployee(Id)){
        return "delete succesfull";

       }
       else{
        return "not found";
       }

    }
    
}
