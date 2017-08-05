package fyp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.github.reinert.jjschema.Attributes;
import com.github.reinert.jjschema.SchemaIgnore;

@Entity
public class Site {
	
	

	@Id //this column is the ID of the table
	@GeneratedValue(strategy = GenerationType.AUTO) //assigns each site an ID automatically (auto incremenet)
	@SchemaIgnore // dont show in schema
    private int siteID;
    
	@Attributes(title = "Site Name", description = "The name of the site where the work is carried out", minLength=2)
	@Column(unique = true) // eliminates duplicates of description (e.g. FMC)
	private String description;
	
    
    public Site() {
	}//empty constructor


	/**
	 * @param siteID
	 * @param description
	 */
	public Site(int siteID, String description) {
		this.siteID = siteID;
		this.description = description;
	}


	/**
	 * @return the siteID
	 */
	public int getSiteID() {
		return siteID;
	}


	/**
	 * @param siteID the siteID to set
	 */
	public void setSiteID(int siteID) {
		this.siteID = siteID;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
    
    
}
