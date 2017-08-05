package fyp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fyp.entities.Employee;
import fyp.repo.EmployeeRepository;

// this is the implementation of the EmployeesService interface
// tells spring how to behave
// e.g. I might want to manipulate the data before saving to DB (date)

@Repository
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeerepository;

	@Override
	public Employee save(Employee entry) {		
		return employeerepository.save(entry);
	}
}