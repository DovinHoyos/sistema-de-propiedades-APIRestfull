package com.example.propiedades.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name = "vendedor")
public class Vendedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "dni")
    private String dni;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "email")
    private String email;

    @Column(columnDefinition = "DATETIME", name = "fecha_creacion", updatable = false, nullable = false)
    private Date fechaCreacion;

    @Column(columnDefinition = "DATETIME", name = "fecha_eliminacion", updatable = false, nullable = false)
    private Date fechaEliminacion;



}
