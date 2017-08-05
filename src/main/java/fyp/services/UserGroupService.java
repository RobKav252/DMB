package fyp.services;

import fyp.entities.UserGroup;

// passes available DB methods to Spring (save)
public interface UserGroupService {
	public UserGroup save(UserGroup entry);
	public UserGroup findOne(Integer groupID);
}
