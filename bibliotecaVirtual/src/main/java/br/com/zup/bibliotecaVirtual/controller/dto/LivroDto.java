package br.com.zup.bibliotecaVirtual.controller.dto;

import br.com.zup.bibliotecaVirtual.modelo.Autor;
import br.com.zup.bibliotecaVirtual.modelo.Livro;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

public class LivroDto {


    private Long id;
    @Column(nullable = false)
    private String titulo;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false) @DateTimeFormat(pattern="yyyy/MM/dd HH:mm:ss")
    private LocalDateTime diaDoRegistro = LocalDateTime.now();

    private Autor autor;

    public LivroDto(Livro livro) {
        this.id = livro.getID();
        this.titulo = livro.getTitulo();
        this.descricao = livro.getDescricao();
        this.diaDoRegistro = livro.getDiaDoRegistro();
        this.autor = livro.getAutor();
    }


}
