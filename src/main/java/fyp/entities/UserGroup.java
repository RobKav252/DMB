package fyp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserGroup {
	@Id
    private int groupID;
    private String groupDescription;
    
}
