package com.algaworks.ecommerce.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@Entity
public class Favorito {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne(optional = false)
    private Produto produto;
}
