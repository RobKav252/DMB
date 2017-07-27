package fyp.entities;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Site {

	@Id
    private int siteID;
    private String description;
    
}
