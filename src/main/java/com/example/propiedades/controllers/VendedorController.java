package com.example.propiedades.controllers;

import com.example.propiedades.entities.Vendedor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class VendedorController {
    @PostMapping("/api/vendedor")
    public void agregar(@RequestBody Vendedor vendedor){

    }

    @PutMapping("/api/vendedor/{id}")
    public void modificar(@RequestBody Vendedor vendedor, @PathVariable Long id){

    }

    @DeleteMapping("/api/vendedor/{id}")
    public void eliminar(@PathVariable Long id){

    }

    @GetMapping("/api/vendedor/{id}")
    public Vendedor get(@PathVariable ("id") Long id){
        Vendedor v1 = new Vendedor();
        v1.setId(id);
        v1.setNombre("Dovin");
        v1.setApellido("Hoyos");
        v1.setEmail("dovricarbhoy@gmail.com");
        v1.setDni("1061797259");

        return v1;
    }

    @GetMapping("/api/vendedor")
    public List<Vendedor> getAll(){
        
        List<Vendedor> lista = new ArrayList<>();
        Vendedor v1 = new Vendedor();
        v1.setId(1L);
        v1.setNombre("Dovin");
        v1.setApellido("Hoyos");
        v1.setEmail("dovricarbhoy@gmail.com");
        v1.setDni("1061797259");

        Vendedor v2 = new Vendedor();
        v2.setId(2L);
        v2.setNombre("Santiago");
        v2.setApellido("Hoyos");
        v2.setEmail("camillusgrove@gmail.com");
        v2.setDni("100897259");

        Vendedor v3 = new Vendedor();
        v3.setId(3L);
        v3.setNombre("Felipe");
        v3.setApellido("Arboleda");
        v3.setEmail("andfeliarbo@gmail.com");
        v3.setDni("100696259");

        lista.add(v1);
        lista.add(v2);
        lista.add(v3);

        return lista;
    }
}
