package com.example.propiedades.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "media")
public class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "urlFinal")
    private String urlFinal;

    @Column(name = "urlLocal")
    private String urlLocal;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_galeria")
    private Galeria galeria;
}
