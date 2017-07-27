package fyp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import fyp.entities.Employee;


// automatic translation between DB (MySQL) and POJO (Employee)
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}