package com.algaworks.ecommerce.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@Entity
public class Categoria {
    @Id
    private Integer id;
    private String nome;
    private Integer categoriaPaiId;


}

