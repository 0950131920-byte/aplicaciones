package com.aitec.edu.msprofesor.repository;

import com.aitec.edu.msprofesor.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor,Long> {

}
