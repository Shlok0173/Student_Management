package net.javaguides.springboot.repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	Page<Student> findAll(Pageable pageable);
// All Crud opperation


}
