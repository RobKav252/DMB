package fyp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import fyp.entities.UserGroup;


// automatic translation through ORM between MySQL DB and POJO (UserGroup)
public interface UserGroupRepository extends JpaRepository<UserGroup, Integer> {
}