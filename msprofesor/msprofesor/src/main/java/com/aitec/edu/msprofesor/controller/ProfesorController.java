package com.aitec.edu.msprofesor.controller;

import com.aitec.edu.msprofesor.entity.Profesor;
import com.aitec.edu.msprofesor.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profesor")

public class ProfesorController {

    @Autowired
    ProfesorService profesorService;

    @PostMapping
    public Profesor saveProfesor (@RequestBody Profesor profesor){
        return profesorService.saveProfesor(profesor);
    }

    @GetMapping
    public List<Profesor> getProfesoAll (){
        return profesorService.getProfesorAll();
    }


    @GetMapping("{id}")
    public Profesor getProfesoAll (@PathVariable Long id){
        return profesorService.getProfesor(id);
    }

}
