package fyp.entities;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// http://www.techferry.com/articles/hibernate-jpa-annotations.html
@Entity
public class TimesheetEntry {

	@Id	
	@GeneratedValue
    private Integer timesheetID;
	
    private Integer employeeID;
    private Date startDate;
    private Date endDate;
    private String workDesc;
    
    // making sure the column has default = NULL
    @Column(insertable = false)
    private Integer siteID;
    
    // making sure the column has default = NULL
    @Column(insertable = false)
    private Integer statusID;
    
    public TimesheetEntry()
    {
    	
    }
    
	public TimesheetEntry(
			int employeeID, 
			Date startDate, 
			Date endDate,
			String workDesc,
			Integer siteID) 
	{
		this.setEmployeeID(employeeID);
		this.setStartDate(startDate);
		this.setEndDate(endDate);
		this.setWorkDesc( workDesc );
		this.setSiteID(siteID);
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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