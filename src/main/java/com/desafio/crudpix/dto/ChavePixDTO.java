package com.desafio.crudpix.dto;

import com.desafio.crudpix.domain.ChavePix;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChavePixDTO implements Serializable {
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

    public ChavePixDTO(ChavePix chavePix) {

        id = chavePix.getId();
        tipoChave = chavePix.getTipoChave();
        valorChave = chavePix.getValorChave();
        tipoConta = chavePix.getTipoConta();
        numeroAgencia = chavePix.getNumeroAgencia();
        numeroConta = chavePix.getNumeroConta();
        nomeCorrentista = chavePix.getNomeCorrentista();
        sobrenomeCorrentista = chavePix.getSobrenomeCorrentista();

    }

}
