package br.com.zup.bibliotecaVirtual.modelo;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
public class Autor {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false) @DateTimeFormat(pattern="yyyy/MM/dd HH:mm:ss")
    private LocalDateTime diaDoRegistro = LocalDateTime.now();

    public Autor() {
    }

    public Autor(String nome, String email, String descricao) {
        this.nome = nome;
        this.email = email;
        this.descricao = descricao;
    }

    public LocalDateTime getDiaDoRegistro() {
        return diaDoRegistro;
    }
}
