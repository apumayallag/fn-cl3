package com.cibertec.cl3.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "categoria")
@Entity
@Getter
@Setter
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String descripcion;
}
