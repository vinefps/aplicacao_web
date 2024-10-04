package com.api.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.crud.models.Department;

@Repository
public interface DepartmentRepository extends
        JpaRepository<Department, Long> {
}
