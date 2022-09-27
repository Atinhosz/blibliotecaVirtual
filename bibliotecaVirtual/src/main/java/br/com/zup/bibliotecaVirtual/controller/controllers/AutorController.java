package br.com.zup.bibliotecaVirtual.controller.controllers;

import br.com.zup.bibliotecaVirtual.controller.dto.AutorDto;
import br.com.zup.bibliotecaVirtual.modelo.Autor;
import br.com.zup.bibliotecaVirtual.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/autor")
public class AutorController {

    @Autowired
    private AutorRepository autorRepository;

    @GetMapping
    public ResponseEntity<List<AutorDto>> lista(){
      List<Autor> autor = autorRepository.findAll();
        return ResponseEntity.ok(AutorDto.converterLista(autor));
    }



}
