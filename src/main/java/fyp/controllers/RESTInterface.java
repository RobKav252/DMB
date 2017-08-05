package fyp.controllers;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import fyp.entities.TimesheetEntry;

public interface RESTInterface {

	public TimesheetEntry addTimesheetEntry(TimesheetEntry timesheetEntry);
	public  TimesheetEntry  getTimesheetEntry( Integer timesheetID);
	
	
//}
}
