package com.springboot.departmentservice.service;

import com.springboot.departmentservice.entity.Department;
import com.springboot.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;


    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment of DepartmentService ");
        return departmentRepository.save(department);
    }

    public Department findDepartmentbyId(Long departmentId) {
        log.info("Inside findDepartmentbyId of DepartmentService ");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
