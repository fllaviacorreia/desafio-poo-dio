package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	
	public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("novo curso java");
        curso1.setCargaHoraria(5);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("novo curso js");
        curso2.setCargaHoraria(10);

        Curso curso3 = new Curso();
        curso3.setTitulo("curso py");
        curso3.setDescricao("novo curso py");
        curso3.setCargaHoraria(10);
        
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("nova mentoria java");
        mentoria1.setData(LocalDate.now());
        
        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("mentoria de js");
        mentoria2.setDescricao("nova mentoria js");
        mentoria2.setData(LocalDate.now());
        
        Mentoria mentoria3 = new Mentoria();
        mentoria3.setTitulo("mentoria de py");
        mentoria3.setDescricao("nova mentoria py");
        mentoria3.setData(LocalDate.now());

        System.out.println("___CURSOS___");
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
        

        System.out.println("\n___MENTORIAS___");
        System.out.println(mentoria1);
        System.out.println(mentoria2);
        System.out.println(mentoria3);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Novo Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);
        bootcamp.getConteudos().add(mentoria3);


        System.out.println("\n___BOOTCAMP___");
        System.out.println(bootcamp);
        

        System.out.println("\n___DEVS___");
        Dev devJulia = new Dev();
        devJulia.setNome("Julia");
        devJulia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Julia:" + devJulia.getConteudosInscritos());
        devJulia.progresso();
        devJulia.progresso();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Julia:" + devJulia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Julia:" + devJulia.getConteudosConcluidos());
        System.out.println("XP:" + devJulia.calcularTotalXP());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progresso();
        devJoao.progresso();
        devJoao.progresso();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXP());
        
        System.out.println("\n___BOOTCAMP___");
        System.out.println(bootcamp);
        
	}
}
