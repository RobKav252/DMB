package fyp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fyp.entities.UserGroup;
import fyp.repo.UserGroupRepository;

@Repository
public class UserGroupServiceImpl implements UserGroupService {

	@Autowired
	private UserGroupRepository usergrouprepository; //DB con to recall

	@Override
	public UserGroup save(UserGroup entry) {
		return usergrouprepository.save(entry);
	}
	
	@Override
	public UserGroup findOne(Integer groupID) {
		return usergrouprepository.findOne(groupID);
	}
}

