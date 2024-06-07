package com.desafio.crudpix.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChavePix implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    String id;

    String tipoChave;

    String valorChave;

    String tipoConta;

    Integer numeroAgencia;

    Integer numeroConta;

    String nomeCorrentista;

    String sobrenomeCorrentista;

}
