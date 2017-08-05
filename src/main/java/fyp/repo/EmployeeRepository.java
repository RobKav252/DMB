package fyp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import fyp.entities.Employee;


// automatic translation through ORM between MySQL DB and POJO (Employee)
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}