package fyp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fyp.entities.TimesheetEntry;
import fyp.repo.TimesheetEntryRepository;

@Repository
public class TimesheetEntryServiceImpl implements TimesheetEntryService {

	@Autowired
	private TimesheetEntryRepository timesheetrepository;

	@Override
	public TimesheetEntry save(TimesheetEntry entry) {
		return timesheetrepository.save(entry);
	}
}