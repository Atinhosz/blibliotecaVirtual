package br.com.zup.bibliotecaVirtual.controller.controllers;

import br.com.zup.bibliotecaVirtual.controller.dto.AutorDtoRequest;
import br.com.zup.bibliotecaVirtual.controller.dto.AutorDtoResponse;
import br.com.zup.bibliotecaVirtual.modelo.Autor;
import br.com.zup.bibliotecaVirtual.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/autor")
public class AutorController {

    @Autowired
    private AutorRepository autorRepository;

    @PostMapping
    public ResponseEntity<AutorDtoRequest> criar(@RequestBody @Valid AutorDtoRequest autorDtoRequest, UriComponentsBuilder uriComponentsBuilder){
       Autor autor = autorDtoRequest.paraAutor();
       Autor salvarAutor = autorRepository.save(autor);
       URI uri = uriComponentsBuilder.path("/autor/{id}").buildAndExpand(autor.getId()).toUri();
        return ResponseEntity.created(uri).build();

    }

    @GetMapping
    public ResponseEntity<List<AutorDtoResponse>> lista(){
      List<Autor> autor = autorRepository.findAll();
        return ResponseEntity.ok(AutorDtoResponse.converterLista(autor));
    }



}
