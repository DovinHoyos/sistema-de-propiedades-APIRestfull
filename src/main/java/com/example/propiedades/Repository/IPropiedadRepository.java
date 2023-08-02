package com.example.propiedades.Repository;

import com.example.propiedades.entities.Propiedad;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPropiedadRepository extends CrudRepository<Propiedad, Long> {
}
