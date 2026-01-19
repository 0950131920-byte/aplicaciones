package com.aitec.edu.msprofesor.service;

import com.aitec.edu.msprofesor.entity.Profesor;
import com.aitec.edu.msprofesor.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesorServiceImpl implements ProfesorService {

    @Autowired
    ProfesorRepository  profesorRepository;

    @Override
    public Profesor saveProfesor(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    @Override
    public List<Profesor> getProfesorAll() {
        return profesorRepository.findAll();
    }

    @Override
    public Profesor getProfesor(Long idProfesor) {

        Optional<Profesor> existProfesor = profesorRepository.findById(idProfesor);

        if (existProfesor.isPresent()) {
            return existProfesor.get();
        }else{
            throw  new  RuntimeException();
        }
    }
}
