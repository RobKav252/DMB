package fyp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.github.reinert.jjschema.Attributes;
import com.github.reinert.jjschema.SchemaIgnore;

@Entity
public class UserGroup {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@SchemaIgnore
    private Integer groupID;
	
	@Attributes(title = "User Group Name", description = "The name of the user group", minLength=2)
	@Column(unique = true) // eliminates duplicates of group description (e.g. Rob)
    private String groupDescription;
	/**
	 * 
	 */
	public UserGroup() {
	}
	/**
	 * @param groupID
	 * @param groupDescription
	 */
	public UserGroup(Integer groupID, String groupDescription) {
		this.groupID = groupID;
		this.groupDescription = groupDescription;
	}
	/**
	 * @return the groupID
	 */
	public Integer getGroupID() {
		return groupID;
	}
	/**
	 * @param groupID the groupID to set
	 */
	public void setGroupID(Integer groupID) {
		this.groupID = groupID;
	}
	/**
	 * @return the groupDescription
	 */
	public String getGroupDescription() {
		return groupDescription;
	}
	/**
	 * @param groupDescription the groupDescription to set
	 */
	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}
    
	
    
    
}
