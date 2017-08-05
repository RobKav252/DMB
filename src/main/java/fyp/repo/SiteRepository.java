package fyp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import fyp.entities.Site;


// automatic translation through ORM between MySQL DB and POJO (Site)
public interface SiteRepository extends JpaRepository<Site, Integer> {
}