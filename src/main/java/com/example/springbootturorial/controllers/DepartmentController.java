package com.example.springbootturorial.controllers;

import com.example.springbootturorial.entity.Department;
import com.example.springbootturorial.error.DepartmentNotFound;
import com.example.springbootturorial.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable Long id) throws DepartmentNotFound {
        return departmentService.fetchDepartmentById(id);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable Long id) {
        departmentService.deleteDepartmentById(id);
        return "Department deleted successfully";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartmentById(@PathVariable Long id,@RequestBody Department department) {
        return departmentService.updateDepartmentById(id,department);
    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByDepartmentName(@PathVariable("name") String departmentName) {
        return departmentService.fetchDepartmentByDepartmentName(departmentName);
    }
}