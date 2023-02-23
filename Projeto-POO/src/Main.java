import java.time.LocalDate;

import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso de Java");
        curso.setDescricao("Curso de Java Developer Inter");
        curso.setCargaHoraria(60);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria para curso de Java");
        mentoria.setData(LocalDate.now());

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Inter Java Developer");
        bootCamp.setDescricao("Curso de Java em parceria com banco Inter");
        bootCamp.getConteudos().add(curso);
        bootCamp.getConteudos().add(mentoria);

        Dev devWemerson = new Dev();
        devWemerson.setNome("Wemerson");
        devWemerson.inscreverBootCamp(bootCamp);
        System.out.println("conteúdos inscritos Wemerson: "+ devWemerson.getConteudosInscritos());
        devWemerson.progredir();
        System.out.println("conteúdos concluídos Wemerson: "+ devWemerson.getConteudosConcluidos());
        System.out.println("XP: "+ devWemerson.calcularXP());


        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootCamp(bootCamp);
        System.out.println("conteúdos inscritos João: "+ devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("conteúdos concluídos Wemerson: "+ devJoao.getConteudosConcluidos());
        System.out.println("XP: "+ devJoao.calcularXP());

    }
}
