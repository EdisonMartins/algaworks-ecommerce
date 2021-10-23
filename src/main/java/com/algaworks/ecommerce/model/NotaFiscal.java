package com.algaworks.ecommerce.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@Entity
public class NotaFiscal {
    @Id
    private Integer id;
    private Integer predidoId;
    private String xml;
    private Date dataEmissao;
}
