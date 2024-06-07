package com.desafio.crudpix.service;

import com.desafio.crudpix.domain.ChavePix;
import com.desafio.crudpix.dto.ChavePixDTO;

import java.util.List;

public interface ChavePixService {

    List<ChavePix> findAll();
    ChavePix findById(String id);
    ChavePix insert(ChavePix chavePix);
    ChavePix fromDTO(ChavePixDTO chavePix);
    void delete(String id);
    ChavePix update(ChavePix chavePix);

}
