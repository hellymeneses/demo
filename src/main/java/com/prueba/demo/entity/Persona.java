package com.prueba.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "persona")
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @Column(name = "apellido", nullable = false, length = 50)
    private String apellido;
    @Column(name = "tipo_documento", nullable = false, length = 4)
    private String tipoDocumento;
    @Column(name = "documento", nullable = false, length = 10, unique = true)
    private String documento;
    @Column(name = "email", nullable = false, length = 50, unique = true)
    private String email;
    @Column(name = "numero_celular", nullable = false, length = 10)
    private String numeroCelular;
}
