package exercicios.dio;


import java.util.ArrayList;
import java.util.Scanner;

public class Termometro {
	
	public static void main(String[] args) {
		
		//RECEBENDO A TEMPERATUDA DOS 6 PRIMEIROS MESES
		ArrayList<Double> temperaturas = new ArrayList <Double>();
		Scanner input = new Scanner (System.in);
		
		for(int i = 1; i<=6; i++) {
			System.out.println("Digite a temperatura do mes de " + i + ": " );
			double temperatura = input.nextDouble();
			temperaturas.add(temperatura);
		}
		System.out.println(temperaturas);
		
		//CALCULO DA MEDIA SEMESTRAL
		
		double soma = 0;
		for (double temperatura : temperaturas) { //É UM FOR EACH(PARA CADA) VAI INTERA ATRAVES DOS ELEMENTOS DA COLEÇÃO DE MANEIRA SIMPLES, O LOOP VAI PERCORERE CADA ELEMENTO DA TEMPERATURA E A CADA ITERACAO ASSUMIRAR O VALOR DO ELEMENTO ATUAL 
			soma += temperatura;
		}
		double media = soma/temperaturas.size();
		System.out.printf("Valor da media semestral: %.2f\n " , media);
		
		//MOSTRANDO AS TEMPERATURAS ACIMA DA MEDIA COM MESES CORRESPONDENTES
		System.out.println("Temperaturas acima da media: "); //CABEÇALHO DAS TEMP POIS SE ISSO FICAR DENTRO DO FOR VAI REPETIR SEMPRE, ABAIXO DO FOR FICA CONFUSO 
		for(int i = 0; i < temperaturas.size(); i++) {
			if (temperaturas.get(i) > media) {
				String mesNome = obterMesNome(i + 1); // VAI EXECUTAR O MÉTODO COM PS NOMES DOS MESES E REALCIONAR COM OS INDICES DA LISTA TEMPERATURA
				System.out.println(mesNome + ": " + temperaturas.get(i));
			}
		}
		input.close();
	}
	//METODO AUXILIAR PARA OBTER O MES POR EXTENSO 
	private static String obterMesNome(int numeroMes) {
		switch(numeroMes) {
		case 1:
			return "Janeiro";
		case 2:
			return "Fevereiro";
		case 3:
			return "Marco";
		case 4:
			return "Abril";
		case 5:
			return "Maio";
		case 6:
			return "Junho";
		default:
			return "Mês invalido";
			
		}
	}
}


	
	