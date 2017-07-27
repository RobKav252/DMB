package fyp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fyp.entities.Site;
import fyp.repo.SiteRepository;

@Repository
public class SiteServiceImpl implements SiteService {

	@Autowired
	private SiteRepository siterepository;

	@Override
	public Site save(Site entry) {
		return siterepository.save(entry);
	}
}