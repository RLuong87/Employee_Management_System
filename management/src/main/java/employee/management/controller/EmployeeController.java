package employee.management.controller;

import employee.management.model.Employee;
import employee.management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public ResponseEntity<Iterable<Employee>> getAll() {
        return new ResponseEntity<>(employeeRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @PutMapping("/update/{id}")
    public @ResponseBody Employee updateEmployee(@PathVariable Long id, @RequestBody Employee updates) {

        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        if (updates.getFirstName() != null) employee.setFirstName(updates.getFirstName());
        if (updates.getLastName() != null) employee.setLastName(updates.getLastName());
        if (updates.getMaritalStatus() != null) employee.setMaritalStatus(updates.getMaritalStatus());
        if (updates.getGender() != null) employee.setGender(updates.getGender());
        if (updates.getDatOfBirth() != null) employee.setDatOfBirth(updates.getDatOfBirth());
        if (updates.getAddress() != null) employee.setAddress(updates.getAddress());
        if (updates.getCity() != null) employee.setCity(updates.getCity());
        if (updates.getState() != null) employee.setState(updates.getState());
        if (updates.getZipcode() != null) employee.setZipcode(updates.getZipcode());
        if (updates.getPhoneNumber() != null) employee.setPhoneNumber(updates.getPhoneNumber());
        if (updates.getEmail() != null) employee.setEmail(updates.getEmail());
        if (updates.getSsn() != null) employee.setSsn(updates.getSsn());
        if (updates.getTitle() != null) employee.setTitle(updates.getTitle());
        if (updates.getSalary() != null) employee.setSalary(updates.getSalary());
        if (updates.isHealthInsurance()) employee.setHealthInsurance(updates.isHealthInsurance());
        if (updates.isDentalInsurance()) employee.setDentalInsurance(updates.isDentalInsurance());
        if (updates.isRetirementPlan()) employee.setRetirementPlan(updates.isRetirementPlan());

        return employeeRepository.save(employee);
    }
}
