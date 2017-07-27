package fyp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
    private int employeeID;
    private String name;
    private int groupID;
}
