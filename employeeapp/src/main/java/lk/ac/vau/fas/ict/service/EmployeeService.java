package lk.ac.vau.fas.ict.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PathVariable;

import jakarta.persistence.EntityNotFoundException;
import lk.ac.vau.fas.ict.model.Employee;
import lk.ac.vau.fas.ict.repo.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo repo;

	public List<Employee> getEmp()
	{
		return repo.findAll();
	}
    
	public Employee getEmps(String id) {
		if(repo.findById(id).isEmpty())
		{
			throw new EntityNotFoundException("Employee Not found");
			
		}
		return repo.findById(id).get();
	}
	
	public List<Employee>getEmployeeBySalary(double s1,double s2){
		if(repo.getEmpSalary(s1,s2).isEmpty())
		{
			throw new EntityNotFoundException("Employee Not found");
			
		}
		return repo.getEmpSalary(s1,s2);
	}
	
}
