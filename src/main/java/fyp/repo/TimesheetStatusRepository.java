package fyp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import fyp.entities.TimesheetStatus;

public interface TimesheetStatusRepository extends JpaRepository<TimesheetStatus, Long> {
}

