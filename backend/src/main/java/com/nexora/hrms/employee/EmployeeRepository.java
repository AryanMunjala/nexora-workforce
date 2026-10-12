package com.nexora.hrms.employee;
import org.springframework.data.jpa.repository.JpaRepository; import java.util.List;
public interface EmployeeRepository extends JpaRepository<Employee,Long> { boolean existsByEmailIgnoreCase(String email); List<Employee> findByFullNameContainingIgnoreCaseOrEmailContainingIgnoreCaseOrDepartmentContainingIgnoreCase(String name,String email,String department); }
