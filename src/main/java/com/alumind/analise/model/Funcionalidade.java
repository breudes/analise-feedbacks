package com.alumind.analise.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "funcionalidades")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Funcionalidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String codigo;
    @NotNull
    private String descricao;
    @ManyToOne
    private Analise analise;
}