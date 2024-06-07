package com.desafio.crudpix.repository;

import com.desafio.crudpix.domain.ChavePix;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChavePixRepository extends MongoRepository<ChavePix, String> {
}
