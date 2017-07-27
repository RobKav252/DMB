package fyp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fyp.entities.UserGroup;
import fyp.repo.UserGroupRepository;

@Repository
public class UserGroupServiceImpl implements UserGroupService {

	@Autowired
	private UserGroupRepository userGroupRepository; //DB con to recall

	@Override
	public UserGroup save(UserGroup entry) {
		return userGroupRepository.save(entry);
	}
}

