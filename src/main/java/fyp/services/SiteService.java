package fyp.services;

import java.util.List;

import fyp.entities.Site;

// passes available DB methods to Spring (save)
public interface SiteService {
	public Site save(Site entry);
	public Site findOne(Integer siteID);
	public List<Site> findAll();
	
}
