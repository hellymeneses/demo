package com.prueba.demo.serviceInterface;

import com.prueba.demo.entity.Persona;

import java.util.Optional;

public interface PersonaInterface {

    public Persona create(Persona persona);
    public Persona update(Persona persona);

    void delete(Long id);

    public Optional<Persona> findById(Long id);
}
