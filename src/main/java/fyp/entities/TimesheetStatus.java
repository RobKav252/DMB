package fyp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TimesheetStatus {
	
	@Id
    private Integer statusID;
    private String description;
	
    
    public TimesheetStatus ()  //empty constructor
    {
    	
    }
   
  

	public TimesheetStatus (int statusID, String description) {
    	this.statusID = statusID;
		this.description = description;
    }
	
    
    
    public int getStatusID() {
		return statusID;
	}



	public void setStatusID(int statusID) {
		this.statusID = statusID;
	}



	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
    
   
   
}
