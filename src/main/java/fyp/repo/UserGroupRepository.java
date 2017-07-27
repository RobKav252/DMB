package fyp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import fyp.entities.Site;
import fyp.entities.UserGroup;


// automatic translation between DB (MySQL) and POJO (TimesheetEntry)
public interface UserGroupRepository extends JpaRepository<UserGroup, Long> {
}