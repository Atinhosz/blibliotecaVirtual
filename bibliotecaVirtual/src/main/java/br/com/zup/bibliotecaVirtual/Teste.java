package br.com.zup.bibliotecaVirtual;

import br.com.zup.bibliotecaVirtual.modelo.Autor;
import br.com.zup.bibliotecaVirtual.modelo.Livro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Teste {
    public static void main(String[] args) {

        Autor autor = new Autor("HPLoveCraft","hpLoveCraft@emailInvalido@.com.errado",
                "esse cara fez livros mutio bons porem era racista :/");
        Livro livro = new Livro("O chamado de Chuthulo","978-3-16-148410-0",
                "Livro que conta historias sobre o medo dos cosmos");
    }

}
