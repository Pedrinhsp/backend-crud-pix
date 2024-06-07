package com.desafio.crudpix.resource;

import com.desafio.crudpix.domain.ChavePix;
import com.desafio.crudpix.dto.ChavePixDTO;
import com.desafio.crudpix.service.ChavePixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/pix")
public class ChavePixResource {

    @Autowired
    private ChavePixService service;

    @GetMapping("/")
    public ResponseEntity<List<ChavePixDTO>> findAll() {
        List<ChavePix> lista = service.findAll();

        //Passa conversão da lista para DTO
        List<ChavePixDTO> listaDTO = lista.stream().map(ChavePixDTO::new).toList();
        return ResponseEntity.ok().body(listaDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ChavePixDTO> findById(@PathVariable String id) {
            return ResponseEntity.ok().body(new ChavePixDTO(service.findById(id)));
    }

    @PostMapping("/")
    public ResponseEntity<Void> insert(@RequestBody ChavePixDTO chavePixDTO){
        ChavePix obj = service.fromDTO(chavePixDTO);
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable String id, @RequestBody ChavePixDTO chavePixDTO){
        ChavePix obj = service.fromDTO(chavePixDTO);
        obj.setId(id);
        service.update(obj);
        return ResponseEntity.noContent().build();
    }

}
