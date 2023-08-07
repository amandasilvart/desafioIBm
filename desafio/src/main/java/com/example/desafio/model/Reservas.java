package com.example.desafio.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Reservas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomeHospede;

    private String dataInicio;
    private String dataFim;
    private Integer quantidadePessoas;

}