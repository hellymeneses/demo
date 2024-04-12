package com.prueba.demo.dao;

import com.prueba.demo.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaDao extends JpaRepository <Persona,Long>{

}
