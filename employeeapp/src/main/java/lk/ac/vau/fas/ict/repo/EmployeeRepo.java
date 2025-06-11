package lk.ac.vau.fas.ict.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import lk.ac.vau.fas.ict.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,String>{
	//Find the employee with the salary range 70000 to 90000
		@Query("SELECT e From Employee e WHERE e.salary BETWEEN ?1 AND ?2")
		public List<Employee> getEmpSalary(double s1,double s2);
		
		
		//Find the employees who are working in a department (pass dept id)
		//find the youngest female employees

}
