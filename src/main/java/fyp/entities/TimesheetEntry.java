package fyp.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.github.reinert.jjschema.Attributes;

// http://www.techferry.com/articles/hibernate-jpa-annotations.html
@Entity
public class TimesheetEntry {

	@Id	
	@GeneratedValue
    private Integer timesheetID;
	
    private Integer employeeID;
    
    @Attributes(title = "Start Date")
    private String dateBegin;
    
    @Attributes(title = "End Date")
    private String dateEnd;
    private String workDesc;
    
    // column default value = null
    //@Column(insertable = false)
    private Integer siteID;
    
    
 //   @Column(insertable = false)
    private Integer statusID;
    
 
    // empty constructor?? without will not save to DB (I think)
    public TimesheetEntry()
    {
    	
    }
    
	public TimesheetEntry(
			int employeeID, 
			String dateBegin, 
			String dateEnd,
			String workDesc,
			Integer siteID) 
	{
		this.setEmployeeID(employeeID);
		this.setDateBegin(dateBegin);
		this.setDateEnd(dateEnd);
		this.setWorkDesc( workDesc );
		this.setSiteID(siteID);
	}
	

    

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getDateBegin() {
		return dateBegin;
	}

	public void setDateBegin(String dateBegin) {
		this.dateBegin = dateBegin;
	}

	public String getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(String dateEnd) {
		this.dateEnd = dateEnd;
	}

	public String getWorkDesc() {
		return workDesc;
	}

	public void setWorkDesc(String workDesc) {
		this.workDesc = workDesc;
	}

	public Integer getSiteID() {
		return siteID;
	}

	public void setSiteID(Integer siteID2) {
		this.siteID = siteID2;
	}
//
//	public int getStatusID() {
//		return statusID;
//	}
//
//	public void setStatusID(int statusID) {
//		this.statusID = statusID;
//	}
    
}