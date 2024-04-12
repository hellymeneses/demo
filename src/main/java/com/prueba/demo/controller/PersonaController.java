package com.prueba.demo.controller;

import com.prueba.demo.entity.Persona;
import com.prueba.demo.serviceInterface.PersonaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    PersonaInterface personaInterface;

    @GetMapping("/{id}")
    public Persona findById(@PathVariable Long id){
        return personaInterface.findById(id).get();
    }

    @PostMapping("/create")
    public Persona createPersona(@RequestBody Persona persona){
        return personaInterface.create(persona);
    }

    @PutMapping("/update")
    public Persona updatePersona(@RequestBody Persona persona){
        return personaInterface.update( persona);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePersona(@PathVariable Long id){
        personaInterface.delete(id);
    }
}