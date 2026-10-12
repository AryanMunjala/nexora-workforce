package com.nexora.hrms.employee;
import org.springframework.stereotype.Service; import org.springframework.transaction.annotation.Transactional; import java.util.List;
@Service @Transactional public class EmployeeService {
private final EmployeeRepository repository; public EmployeeService(EmployeeRepository repository){this.repository=repository;}
public List<Employee> all(String s){if(s==null||s.isBlank())return repository.findAll();return repository.findByFullNameContainingIgnoreCaseOrEmailContainingIgnoreCaseOrDepartmentContainingIgnoreCase(s,s,s);}
public Employee one(Long id){return repository.findById(id).orElseThrow(()->new EmployeeNotFoundException(id));}
public Employee create(EmployeeRequest r){if(repository.existsByEmailIgnoreCase(r.email()))throw new DuplicateEmailException(r.email());return repository.save(apply(new Employee(),r));}
public Employee update(Long id,EmployeeRequest r){Employee e=one(id);if(!e.getEmail().equalsIgnoreCase(r.email())&&repository.existsByEmailIgnoreCase(r.email()))throw new DuplicateEmailException(r.email());return repository.save(apply(e,r));}
public void delete(Long id){repository.delete(one(id));}
private Employee apply(Employee e,EmployeeRequest r){e.setFullName(r.fullName().trim());e.setEmail(r.email().trim().toLowerCase());e.setDepartment(r.department().trim());e.setJobTitle(r.jobTitle().trim());e.setStatus(r.status());return e;}
}
