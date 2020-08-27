package br.edu.univas.main;

import java.util.Scanner;

public class Exercicio2 {
	
	static Scanner read = new Scanner(System.in);
	static int tamanhoVetor = 5;
	static int i = 0;
	static int aux = 0;
	public static void main(String[] args) {
		
		int vet1 [] = new int [tamanhoVetor];
		int vet2 [] = new int [tamanhoVetor];	
		int vet3 [] = new int [tamanhoVetor*2];		
		
		System.out.println("Digite os valores do primeiro vetor");
		
		leValoresVet(vet1);
		
		System.out.println("Digite os valores do segundo vetor");
		
		leValoresVet(vet2);
		
		mesclaVets(vet1,vet2,vet3);
		
		tamanhoVetor = tamanhoVetor * 2;
		
		ordenador(vet3);
		
		mostraVetOrdenado(vet3);
		
		read.close();
	}
	
	public static void mostraVetDesordenado(int vet []) {
		
		System.out.println("Vetor desordenado: ");
		
		for(i = 0; i < tamanhoVetor ; i++){
		
			System.out.println(" "+vet[i]);
		
		}
		
	}
	
	public static void ordenador (int vet []) {
		
		for(i = 0; i < tamanhoVetor; i++){
			
			for(int j = 0; j < tamanhoVetor - 1; j++){
			
				if(vet[j] > vet[j + 1]){
				
					aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
				
				}
			
			}
			
		}
		
	}
	
	public static void mostraVetOrdenado (int vet[]) {
		
		System.out.println("Vetor organizado:");
		
		for(i = 0; i < tamanhoVetor; i++){
		
			System.out.println(" "+vet[i]);
		
		}
		
	}

	public static void mesclaVets (int vet1 [], int vet2 [], int vet3 [] ) {
		
		for(i = 0; i < tamanhoVetor; i++){
			
			vet3 [i] = vet1[i];
			vet3 [i+tamanhoVetor] = vet2[i];
			
		}
		
		System.out.println("////////////////////////");
		
		for(i = 0; i < (tamanhoVetor * 2); i++){
			
			System.out.println(" "+vet3[i]);
		
		}
	}

	public static void leValoresVet(int vet []) {
		
		for(i = 0; i < (tamanhoVetor); i++){
			
			vet[i] = read.nextInt();
					
		}
						
	}
	
}
