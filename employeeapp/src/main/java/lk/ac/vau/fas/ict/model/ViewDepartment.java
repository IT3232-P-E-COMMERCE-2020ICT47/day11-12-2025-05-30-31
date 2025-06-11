package lk.ac.vau.fas.ict.model;

import java.sql.Date;
import java.util.List;

public class ViewDepartment extends Department{
	private int empcount;
	
	public ViewDepartment()
	{
		
	}

	public ViewDepartment(int id, String name, Date established, int employees) {
		super(id, name, established );
		this.empcount = employees;
		
	}

	public int getEmpcount() {
		return empcount;
	}

	public void setEmpcount(int empcount) {
		this.empcount = empcount;
	}

	
	
	
}
