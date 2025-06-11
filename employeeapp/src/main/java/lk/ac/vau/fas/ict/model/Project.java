package lk.ac.vau.fas.ict.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int id;
	private String name;
	private long totalcost;
	@ManyToMany
	@JoinTable(name="project_assignments",
    joinColumns = @JoinColumn(name="pro_id"),
    inverseJoinColumns = @JoinColumn(name="emp_id"))
	
	private List<Employee>employees;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getTotalcost() {
		return totalcost;
	}
	public void setTotalcost(long totalcost) {
		this.totalcost = totalcost;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	

}
