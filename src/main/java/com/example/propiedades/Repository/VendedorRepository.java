package com.example.propiedades.Repository;

import com.example.propiedades.entities.Vendedor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class VendedorRepository {

    @PersistenceContext
    private EntityManager dataBase;

    @Transactional
    public void guardarVendedor(Vendedor vendedor){
        String sql = "INSERT INTO `vendedor` (`apellido`, `dni`, `email`, `nombre`, `telefono`) " +
                "VALUES (:paramApellido, :paramDni, :paramEmail, :paramNombre, :paramTelefono)";

        dataBase.createQuery(sql)
                .setParameter("paramApellido,", vendedor.getApellido())
                .executeUpdate();
    }

    @Transactional
    public void eliminarVendedor(Vendedor vendedor){
        String sql = "DELETE FROM vendedor WHERE `vendedor`.`id` = 1";

        dataBase.createQuery(sql)
                .setParameter("paramApellido", vendedor.getApellido())
                .executeUpdate();
    }
}
