package fyp.services;


import fyp.entities.TimesheetEntry;

//passes available DB methods to Spring (save)
public interface TimesheetEntryService {
	public TimesheetEntry save(TimesheetEntry entry);
	public TimesheetEntry findOne(Integer entryID);
	
	
}
