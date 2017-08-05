package fyp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import fyp.entities.TimesheetStatus;

// automatic translation through ORM between MySQL DB and POJO (TimesheetStatus)
public interface TimesheetStatusRepository extends JpaRepository<TimesheetStatus, Integer> {
}

