package assignment.infoware.service;

import java.util.List;

import assignment.infoware.model.Employee;
import org.springframework.data.domain.Page;

public interface EmployeeService {
	//to get all the employees
	List<Employee> getAllEmployees();

	//To save the new employee
	void saveEmployee(Employee employee);

	//get employee by id
	Employee getEmployeeById(long id);

	//delete employee by id
	void deleteEmployeeById(long id);

	//to show list for existing employees
	Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
