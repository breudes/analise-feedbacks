package com.alumind.analise.model;

import com.alumind.analise.model.enums.Sentimento;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Entity
@Table(name = "analises")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Analise {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @NotNull @Enumerated(EnumType.STRING)
    private Sentimento sentimento;
    private String servico;
    private String plataforma;
    @OneToMany(mappedBy = "analise")
    private List<Funcionalidade> funcionalidades;
    @ManyToOne(optional=false)
    private Feedback feedback;
}
