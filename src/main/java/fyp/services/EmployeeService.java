package fyp.services;


import fyp.entities.Employee;

// passes available DB methods to Spring (save)

public interface EmployeeService {
	public Employee save(Employee entry);
}
