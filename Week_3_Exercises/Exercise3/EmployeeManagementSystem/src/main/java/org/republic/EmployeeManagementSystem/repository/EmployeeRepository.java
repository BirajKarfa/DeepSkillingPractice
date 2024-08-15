package org.republic.EmployeeManagementSystem.repository;

import java.util.List;

import org.republic.EmployeeManagementSystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	//derivedQueries
	public List<Employee> findByNameContaining(String name);

}
