package com.example.springbootturorial.service;

import com.example.springbootturorial.entity.Department;
import com.example.springbootturorial.error.DepartmentNotFound;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long id) throws DepartmentNotFound;

    void deleteDepartmentById(Long id);

    Department updateDepartmentById(Long id, Department department);

    Department fetchDepartmentByDepartmentName(String departmentName);
}