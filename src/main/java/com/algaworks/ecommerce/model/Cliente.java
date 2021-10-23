package com.algaworks.ecommerce.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    private Integer id;
    private String nome;
    private SexoCliente sexo;

}
