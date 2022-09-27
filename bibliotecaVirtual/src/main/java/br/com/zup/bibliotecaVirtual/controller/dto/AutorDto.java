package br.com.zup.bibliotecaVirtual.controller.dto;

import br.com.zup.bibliotecaVirtual.modelo.Autor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AutorDto {

    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false, length = 400)
    private String descricao;
    @Column(nullable = false) @DateTimeFormat(pattern="yyyy/MM/dd HH:mm:ss")
    private LocalDateTime diaDoRegistro = LocalDateTime.now();


    public AutorDto(Autor autor){
        this.id = autor.getId();
        this.descricao = autor.getDescricao();
        this.nome = autor.getNome();
        this.diaDoRegistro = autor.getDiaDoRegistro();
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getDiaDoRegistro() {
        return diaDoRegistro;
    }

    public static List<AutorDto> converterLista(List<Autor> autor) {
        return autor.stream().map(AutorDto::new).collect(Collectors.toList());
    }
}
