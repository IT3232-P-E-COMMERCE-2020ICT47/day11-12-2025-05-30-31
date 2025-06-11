package lk.ac.vau.fas.ict.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import lk.ac.vau.fas.ict.model.Employee;
import lk.ac.vau.fas.ict.service.EmployeeService;



@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	public EmployeeService service;
	
	@GetMapping
	public ResponseEntity<List<Employee>> getEmp(){
		return new ResponseEntity<List<Employee>>
		  (service.getEmp(),HttpStatus.OK);
	}
	
	@GetMapping("/{empNo}")
	public ResponseEntity<Employee> getEmps(@PathVariable("empNo") String empNo){
		return new ResponseEntity<Employee>(service.getEmps(empNo),HttpStatus.OK);
		
	}
	
	
	@GetMapping("/salary/{n1}/{n2}")
    public ResponseEntity<List<Employee>> FindSalary(@PathVariable("n1") double n1, @PathVariable("n2") double n2) {
        return new ResponseEntity<List<Employee>>(service.getEmployeeBySalary(n1, n2), HttpStatus.OK);
    }
	

}
