package fyp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.github.reinert.jjschema.Attributes;
import com.github.reinert.jjschema.SchemaIgnore;

@Entity
public class Employee {
	

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@SchemaIgnore
    private Integer employeeID;
    
	@Attributes(title = "Employee Name", description = "The name of the employee", minLength=2)
	@Column(unique = true) // eliminates duplicates of description (e.g. Rob)
	private String name;
   
	
    
    public Employee() {
    	
	}

	public Employee(Integer employeeID, String name) {
	
		this.employeeID = employeeID;
		this.name = name;
		
	}

	public Integer getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    
}