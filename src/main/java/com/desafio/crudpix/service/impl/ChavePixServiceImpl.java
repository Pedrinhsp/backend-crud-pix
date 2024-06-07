package com.desafio.crudpix.service.impl;

import com.desafio.crudpix.domain.ChavePix;
import com.desafio.crudpix.dto.ChavePixDTO;
import com.desafio.crudpix.repository.ChavePixRepository;
import com.desafio.crudpix.service.ChavePixService;
import com.desafio.crudpix.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChavePixServiceImpl implements ChavePixService {

    @Autowired
    private ChavePixRepository repository;


    @Override
    public List<ChavePix> findAll() {
        return this.repository.findAll();
    }

    @Override
    public ChavePix findById(String id) {
        return this.repository
                .findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    @Override
    public ChavePix insert(ChavePix chavePix) {
        return null;
    }

    @Override
    public ChavePix fromDTO(ChavePixDTO chavePix) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public ChavePix update(ChavePix chavePix) {
        return null;
    }
}
