package com.employeemanagement.Employeemanagement.repository.employer;

import com.employeemanagement.Employeemanagement.model.employer.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployerRepository extends JpaRepository<Employer,Long> {
}
