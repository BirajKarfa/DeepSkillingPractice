package org.republic.EmployeeManagementSystem.repository;

import java.util.List;

import org.republic.EmployeeManagementSystem.model.Department;
import org.republic.EmployeeManagementSystem.projection.DepartmentNameDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
	//derivedQueries
	public List<Department> findByName(String name);
	
	// Ensure the fully qualified class name matches the actual package
    @Query("SELECT new org.republic.EmployeeManagementSystem.projection.DepartmentNameDTO(d.name) FROM Department d")
    List<DepartmentNameDTO> findDepartmentNames();
    

}
