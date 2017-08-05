package fyp.services;

//import java.util.List;
//
//import fyp.entities.Employee;
import fyp.entities.TimesheetStatus;

// passes available DB methods to Spring (save)
public interface TimesheetStatusService {
	public TimesheetStatus save(TimesheetStatus entry);
	//public List<TimesheetEntry> findByEmployee(Employee employee);
}
