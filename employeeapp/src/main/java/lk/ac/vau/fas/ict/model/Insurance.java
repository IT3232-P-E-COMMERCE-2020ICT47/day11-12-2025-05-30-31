package lk.ac.vau.fas.ict.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Insurance {

	@Id
	@Column(name="Insurance_id")
	private int id;
	@Column(name="Insurance_type")
	private String type;
	@OneToOne
	private Employee employees;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Employee getEmployees() {
		return employees;
	}
	public void setEmployees(Employee employees) {
		this.employees = employees;
	}
	
	
}
