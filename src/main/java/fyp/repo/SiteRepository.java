package fyp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import fyp.entities.Site;


// automatic translation between DB (MySQL) and POJO (TimesheetEntry)
public interface SiteRepository extends JpaRepository<Site, Long> {
}