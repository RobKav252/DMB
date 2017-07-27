package fyp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fyp.entities.TimesheetStatus;
import fyp.repo.TimesheetStatusRepository;

@Repository
public class TimesheetStatusServiceImpl implements TimeSheetStatusService {

	@Autowired
	private TimesheetStatusRepository timesheetstatusRepository;

	@Override
	public TimesheetStatus save(TimesheetStatus entry) {
		return timesheetstatusRepository.save(entry);
	}
}