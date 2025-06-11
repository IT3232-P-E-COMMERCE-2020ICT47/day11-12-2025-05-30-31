package lk.ac.vau.fas.ict.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import lk.ac.vau.fas.ict.model.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Integer>{
	//JPQL
	@Query("Select name from Department")
	public List<String>getDeptNames();
	
	//%:name% -> first parameter(name)
	@Query("SELECT d FROM Department d WHERE d.name LIKE %:name%")
	public List<Department> searchName(String name);
	
	//display departments along with number of employees working there
	/* 
	 * dept name : HR
	 * no_emp:5
	 */
	 @Query("SELECT count(*) FROM Department d "
	 		+ "join d.employees "
	 		+ "WHERE d.id = ?1 ")
     public int numberOfEmp(int did);
}
