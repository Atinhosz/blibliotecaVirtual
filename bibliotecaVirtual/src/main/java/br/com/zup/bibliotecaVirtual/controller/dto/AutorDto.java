package br.com.zup.bibliotecaVirtual.controller.dto;

import br.com.zup.bibliotecaVirtual.modelo.Autor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

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








}
