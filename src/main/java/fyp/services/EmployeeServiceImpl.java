package fyp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fyp.entities.Employee;
import fyp.repo.EmployeeRepository;

@Repository
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeerepository;

	@Override
	public Employee save(Employee entry) {
		return employeerepository.save(entry);
	}
}