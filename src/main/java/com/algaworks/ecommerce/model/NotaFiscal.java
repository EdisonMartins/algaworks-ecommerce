package com.algaworks.ecommerce.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@Entity
@Table(name = "nota_fiscal")
public class NotaFiscal {
    @Id
    private Integer id;
    @Column(name = "pedido_id")
    private Integer pedidoId;
    private String xml;
    private Date dataEmissao;
}
