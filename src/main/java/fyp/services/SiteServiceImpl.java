package fyp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fyp.entities.Site;
import fyp.repo.SiteRepository;

// this is the implementation of the EmployeesService interface
// tells spring how to behave
// e.g. I might want to manipulate the data before saving to DB

@Repository
public class SiteServiceImpl implements SiteService {

	@Autowired
	private SiteRepository siterepository;

	@Override
	public Site save(Site entry) {
		return siterepository.save(entry);
	}

	@Override
	public Site findOne(Integer siteID) {
		
		return siterepository.findOne(siteID);
	}

	@Override
	public List<Site> findAll() {
		return siterepository.findAll();
	}
}