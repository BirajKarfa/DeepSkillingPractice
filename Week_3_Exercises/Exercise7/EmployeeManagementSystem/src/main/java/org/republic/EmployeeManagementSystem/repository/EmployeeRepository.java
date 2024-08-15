package org.republic.EmployeeManagementSystem.repository;

import java.util.List;

import org.republic.EmployeeManagementSystem.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	//derivedQueries
	public List<Employee> findByNameContaining(String name);
	
	// Execute named query to find an employee by email
    public List<Employee> findByEmail(@Param("email") String email);

    // Execute named query to find employees by department name
    public List<Employee> findAllByDepartmentName(@Param("departmentName") String departmentName);
    
    Page<Employee> findAll(Pageable pageable);
    List<Employee> findAll(Sort sort);

}
