package br.com.zup.bibliotecaVirtual;

import br.com.zup.bibliotecaVirtual.modelo.Autor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Teste {
    public static void main(String[] args) {

        Teste teste = new Teste();
        Autor autor = new Autor("a","b","c");

        System.out.println(autor.getDiaDoRegistro());


    }

}
