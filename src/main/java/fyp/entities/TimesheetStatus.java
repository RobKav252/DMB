package fyp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TimesheetStatus {
	@Id
    private int statusID;
    private String description;
   
}
