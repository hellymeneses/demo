package com.prueba.demo.serviceImplement;

import com.prueba.demo.dao.PersonaDao;
import com.prueba.demo.entity.Persona;
import com.prueba.demo.serviceInterface.PersonaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonaService implements PersonaInterface {

    @Autowired
    PersonaDao personaDao;


    @Override
    public Persona create(Persona persona) {
        return personaDao.save(persona);
    }

    @Override
    public Persona update(Persona persona) {
        return personaDao.save(persona);
    }

    @Override
    public void delete(Long id) {
        personaDao.deleteById(id);
    }

    @Override
    public Optional<Persona> findById(Long id) {
        System.out.println("Id: " + id);
        return personaDao.findById(id);
    }
}
