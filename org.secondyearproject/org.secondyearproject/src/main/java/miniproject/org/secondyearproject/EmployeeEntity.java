package miniproject.org.secondyearproject;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity

@Table(name="miniproject")  // Maps to the table name in the database
//public class EmployeeEntity {
   
//    @Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
//    @Column(name = "id")  // Maps to the 'id' column in the database
//    private long id;

//    @Column(name = "name", nullable = false, length = 100)  // Column with constraints
//    private String name;
   
//    @Column(name = "phone", nullable = false, length = 15)  // Phone column with length constraint
//    private String phone;

//    @Column(name = "email", nullable = false, unique = true)  // Email must be unique
//    private String email;



public class EmployeeEntity {
    @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long Id;
    
     private String name;
    private String email;
    private String phone;

    // Getters and setters
    @Column(name = "Id")
    public Long getId(){
     return Id;
   }
   public void setId(Long Id ){
    this.Id=Id;
   }
   
   
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}



