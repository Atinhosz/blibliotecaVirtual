package br.com.zup.bibliotecaVirtual.controller.dto;

import br.com.zup.bibliotecaVirtual.modelo.Autor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class AutorDtoResponse {

    private Long id;
    private String nome;
    private String descricao;
    @DateTimeFormat(pattern="yyyy/MM/dd HH:mm:ss")
    private LocalDateTime diaDoRegistro;


    public AutorDtoResponse(Autor autor){
        this.id = autor.getId();
        this.descricao = autor.getDescricao();
        this.nome = autor.getNome();
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

    public static List<AutorDtoResponse> converterLista(List<Autor> autor) {
        return autor.stream().map(AutorDtoResponse::new).collect(Collectors.toList());
    }
}
