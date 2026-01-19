package com.aitec.edu.msprofesor.service;

import com.aitec.edu.msprofesor.entity.Profesor;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProfesorService {

    Profesor saveProfesor(Profesor profesor );
    List<Profesor> getProfesorAll();
    Profesor getProfesor(Long idProfesor);


}
