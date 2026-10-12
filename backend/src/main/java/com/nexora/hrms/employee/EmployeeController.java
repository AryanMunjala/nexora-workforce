package com.nexora.hrms.employee;
import jakarta.validation.Valid; import org.springframework.http.HttpStatus; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/employees") public class EmployeeController {
private final EmployeeService service; public EmployeeController(EmployeeService service){this.service=service;}
@GetMapping public List<Employee> all(@RequestParam(required=false) String search){return service.all(search);}
@GetMapping("/{id}") public Employee one(@PathVariable Long id){return service.one(id);}
@PostMapping @ResponseStatus(HttpStatus.CREATED) public Employee create(@Valid @RequestBody EmployeeRequest r){return service.create(r);}
@PutMapping("/{id}") public Employee update(@PathVariable Long id,@Valid @RequestBody EmployeeRequest r){return service.update(id,r);}
@DeleteMapping("/{id}") @ResponseStatus(HttpStatus.NO_CONTENT) public void delete(@PathVariable Long id){service.delete(id);}
}
