package com.example.propiedades.services;

import com.example.propiedades.entities.Propiedad;

import java.util.List;

public interface PropiedadInterface {
    void agregar(Propiedad propiedad);
    void modificar(Propiedad propiedad);
    void eliminar(Long id);
    Propiedad get(Long id);
    List<Propiedad> getAll();
}
