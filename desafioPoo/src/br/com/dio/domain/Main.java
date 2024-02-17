package br.com.dio.domain;

import java.time.LocalDate;

public class Main {
	
	public static void main (String [] args) {
		
		Curso curso1 = new Curso();
		//AQUI VOU COLOCAR OS VALORES DO ATRIBUTO DA CLASSE
		curso1.setTitulo("curso java");
		curso1.setDescricao("descricao curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso GO");
		curso2.setDescricao("descricao curso GO");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria java");
		mentoria.setDescricao("descicao mentoria java");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		BootCamp bootcamp = new BootCamp();
		bootcamp.setNome("Bootcamp java developer");
		bootcamp.setDescricao("Descricao bootcamp java developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devThiago = new Dev ();
		devThiago.setNome("Thiago");
		devThiago.inscreverBootCamp(bootcamp);
		System.out.println("Thiago seus Conteudos Inscritos" + devThiago.getConteudosIncritos());
		devThiago.progredir();
		System.out.println("Thiago seus Conteudos Concluidos" + devThiago.getConteudosConcluidos());
		System.out.println("XP: " + devThiago.calcularTotalXp());
		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.inscreverBootCamp(bootcamp);
		System.out.println("Joao seus Conteudos Inscritos" + devJoao.getConteudosIncritos());
		devJoao.progredir();
		System.out.println("Joao seus Conteudos Concluidos" + devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXp());
		
		
		
	}

}
