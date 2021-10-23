package com.algaworks.ecommerce.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@Entity
@Table(name = "favorito")
public class Favorito {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne(optional = false)
    private Produto produto;
}
