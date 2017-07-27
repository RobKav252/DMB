package fyp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import fyp.entities.TimesheetEntry;


// automatic translation between DB (MySQL) and POJO (TimesheetEntry)
public interface TimesheetEntryRepository extends JpaRepository<TimesheetEntry, Long> {
}