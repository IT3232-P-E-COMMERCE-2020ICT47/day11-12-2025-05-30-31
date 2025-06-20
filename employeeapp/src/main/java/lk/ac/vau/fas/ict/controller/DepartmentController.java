package lk.ac.vau.fas.ict.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.ict.model.Department;
import lk.ac.vau.fas.ict.model.ViewDepartment;
//import lk.ac.vau.fas.ict.repo.DepartmentRepo;
import lk.ac.vau.fas.ict.service.DepartmentService;

@RestController
@RequestMapping("/dept")
public class DepartmentController {
	@Autowired
	public DepartmentService service;
	
	@GetMapping
	public ResponseEntity<List<Department>> getDept(){
		return new ResponseEntity<List<Department>>
		  (service.getDept(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Department> getDept(@PathVariable("id") int id){
		return new ResponseEntity<Department>(service.getDept(id),HttpStatus.OK);
		
	}
	
	@PostMapping
	public ResponseEntity<String> addDept(@RequestBody Department department){
		return new ResponseEntity<String>(service.addDept(department),HttpStatus.OK);
		
	}
	
	
	
	
	
	
	/*
   
    @GetMapping
	public List<Department> getDepts()
	{
		return repo.findAll();
	}
    
	@GetMapping("/{id}")
	public Department getDept(@PathVariable("id") int id) {
		return repo.findById(id).get();
	}
	
	@PostMapping
	public String addDept(@RequestBody Department department) {
		repo.save(department);
		return "New Department added";
	}
	
	@PutMapping("/{id}")
	public String updateDept(@PathVariable("id") int id,@RequestBody Department department)
	{
		if(repo.findById(id).isEmpty())
		{
			return "Couldn't find the department";
			
		}
		repo.save(department);
		return "The Department Updated";
	}
	
	@DeleteMapping("/{id}")
	public String deleteDept(@PathVariable("id") int id)
	{
		if(repo.findById(id).isEmpty())
		{
			return "Couldn't find the department";
			
		}
		repo.deleteById(id);
		return "The Department Deleted";
	}
	*/
	
	@GetMapping("/names")
	public ResponseEntity<List<String>> getDeptNames(){
		return new ResponseEntity<List<String>>(service.getDepartmentNames(),HttpStatus.OK);
		
	}
	
	@GetMapping("/search/{name}")
	public ResponseEntity<List<Department>> searchName(@PathVariable("name") String name){
		return new ResponseEntity<List<Department>>(service.searchDepartmentByName(name),HttpStatus.OK);
		
	}
	
	@GetMapping("/empcount/{id}")
	public ResponseEntity<Integer> CountEmp(@PathVariable("id") int id){
		return new ResponseEntity<Integer>(service.getEmpCount(id),HttpStatus.OK);
		
	}
	
	@GetMapping("/vempcount/{id}")
	public ResponseEntity<ViewDepartment> vcountEmp(@PathVariable("id") int id){
		return new ResponseEntity<ViewDepartment>(service.getEmpCountView(id),HttpStatus.OK);
		
	}
	
    
}
