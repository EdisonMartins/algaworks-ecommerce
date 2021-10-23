package com.algaworks.ecommerce.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@Entity
@Table(name = "estoque")
public class Estoque {
    @Id
    private Integer id;

    @Column(name = "produto_id")
    private Integer produtoId;
    private Integer quantidade;
}
