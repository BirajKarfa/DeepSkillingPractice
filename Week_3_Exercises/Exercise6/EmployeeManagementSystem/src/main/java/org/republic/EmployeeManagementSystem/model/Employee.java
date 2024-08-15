package org.republic.EmployeeManagementSystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NamedQueries({
    @NamedQuery(
        name = "Employee.findByEmailNamed",
        query = "SELECT e FROM Employee e WHERE e.email = :email"
    ),
    @NamedQuery(
        name = "Employee.findByDepartmentIdNamed",
        query = "SELECT e FROM Employee e WHERE e.department.id = :departmentId"
    )
})
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long Id;
	
	@Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	Department department;

}
