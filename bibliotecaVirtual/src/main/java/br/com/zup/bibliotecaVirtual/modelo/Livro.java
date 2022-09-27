package br.com.zup.bibliotecaVirtual.modelo;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

public class Livro {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String titulo;
    @Column(nullable = false)
    private String isbn;
    @Column(nullable = false, length = 400)
    private String descricao;
    @Column(nullable = false) @DateTimeFormat(pattern="yyyy/MM/dd HH:mm:ss")
    private LocalDateTime diaDoRegistro = LocalDateTime.now();

    private Autor autor;

    public Livro(){
    }

    public Livro(String titulo, String isbn, String descricao, Autor autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.descricao = descricao;
        this.autor = autor;
    }

    public LocalDateTime getDiaDoRegistro() {
        return diaDoRegistro;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getDescricao() {
        return descricao;
    }

    public Long getID(){
        return id;
    }

    public Autor getAutor() {
        return autor;
    }
}
