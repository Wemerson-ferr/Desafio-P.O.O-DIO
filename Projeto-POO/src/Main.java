import java.time.LocalDate;

import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("CursoXXXXX");
        curso.setDescricao("askdalskdjalskdjaslkda dalskdaslkdjas.");
        curso.setCargaHoraria(60);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("CursoXXXXX");
        mentoria.setDescricao("askdalskdjalskdjaslkda.");
        mentoria.setData(LocalDate.now());

        Conteudo cursoConteudo = new Curso(); //Polimorfismo
        Conteudo mentoriaConteudo = new Mentoria();

        System.out.println(curso);
        System.out.println(mentoria);
    }
}
