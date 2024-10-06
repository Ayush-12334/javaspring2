// /*
//  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
//  * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
//  */




// package miniproject.org.secondyearproject;
// import java.util.ArrayList;
// import java.util.List;

// import org.springframework.beans.BeanUtils;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// @Service
// public class EmployeeserviceImpl implements Employeeservice {
   
//    @Autowired
//    private EmployeeRepository employeeRepository;

   
//    // List<Employee> employees =new ArrayList<>();
//     @Override
//     public String createEmployee(Employee employee) {

//       EmployeeEntity employeeEntity =new EmployeeEntity();
//       BeanUtils.copyProperties(employee,employeeEntity);
//       employeeRepository.save(employeeEntity);
//       // employees.add(employee);
//       return "saved succesfully";
//     }
//     @Override
//     public List<Employee> readEmployee() {
//        List<EmployeeEntity> Employees =employeeRepository.findAll() ;
//        List<Employee> employees =new ArrayList<>();
//        for (EmployeeEntity employeeEntity : Employees) {
        
//         Employee emp= new Employee();
        
//         emp.setName(employeeEntity.getName());
//         emp.setEmail(employeeEntity.getEmail());


        
        
        
//         employees.add(emp);
       
//        }


        
       



        
        
//         return employees;

//     }

//     @Override
//     public boolean deleteEmployee(long Id) {
//         //employees.remove(Id);
//         return true;
//     }
    


// }
package miniproject.org.secondyearproject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeserviceImpl implements Employeeservice {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public String createEmployee(Employee employee) {
        // Convert Employee to EmployeeEntity and save to database
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setName(employee.getName());
        employeeEntity.setEmail(employee.getEmail());
        employeeEntity.setPhone(employee.getPhone());
        employeeRepository.save(employeeEntity);
        return "Saved successfully";
    }

    @Override
    public List<Employee> readEmployee() {
        // Retrieve data from the database
        List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
        List<Employee> employees = new ArrayList<>();
        for (EmployeeEntity employeeEntity : employeeEntities) {
            Employee employee = new Employee();
            employee.setName(employeeEntity.getName());
            employee.setEmail(employeeEntity.getEmail());
            employee.setPhone(employeeEntity.getPhone());
            employees.add(employee);
        }
        return employees;
    }

    @Override
    public boolean deleteEmployee(long Id) {
        // Check if employee exists and delete it from the database
        if (employeeRepository.existsById(Id)) {
            employeeRepository.deleteById(Id);
            return true;
        }
        return false;
    }
}
