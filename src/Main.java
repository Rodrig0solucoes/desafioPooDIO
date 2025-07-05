import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria de java");
        mentoria.setDate(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRodrigo = new Dev();
        devRodrigo.setNome("Rodrigo");
        devRodrigo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Rodrigo" + devRodrigo.getConteudosInscritos());
        devRodrigo.progredir();
        System.out.println("progredi********");
        System.out.println("Conteudos Inscritos Rodrigo" + devRodrigo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Rodrigo" + devRodrigo.getConteudosConcluidos());
        System.out.println("XP: " + devRodrigo.calcularXp());

        System.out.println("///////****////////");

        Dev devLuana = new Dev();
        devLuana.setNome("Luana");
        devLuana.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Luana" + devLuana.getConteudosInscritos());
        devLuana.progredir();
        System.out.println("progredi********");
        System.out.println("Conteudos Inscritos Luana" + devLuana.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Luana" + devLuana.getConteudosConcluidos());
        System.out.println("XP: " + devLuana.calcularXp());


    }

}