package com.example.propiedades.services;

import com.example.propiedades.Repository.IPropiedadRepository;
import com.example.propiedades.Repository.PropiedadRepository;
import com.example.propiedades.entities.Propiedad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropiedadService implements PropiedadInterface{

    @Autowired
    private IPropiedadRepository repository;

    public void agregar(Propiedad propiedad) {
        if (propiedad.getTitulo().equals("")) {
            return;
        }

        repository.save(propiedad);
    }

    public void modificar(Propiedad propiedad) {
        repository.save(propiedad);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }

    public Propiedad get(Long id) {
        return repository.findById(id).get();
    }

    public List<Propiedad> getAll() {
        return (List) repository.findAll();
    }
}
