/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package controller;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ThreadVetor extends Thread {
	int[] numeros;
	int operacao;

	public ThreadVetor(int[] numeros, int operacao) {
		this.numeros = numeros;
		this.operacao = operacao;
		
		
	}
	
	
	
	@Override
	public void run() {
		if (operacao%2 == 0){
            ForEach();
        }else{
        	For();
        }
		
	}



	public void For() {
		
		double tempoInicial, tempoFinal, tempoTotal;
		
		tempoInicial = System.nanoTime();
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		tempoFinal = System.nanoTime();
		tempoTotal = tempoFinal - tempoInicial;
		tempoTotal /= Math.pow(10, 9);
		
		System.out.println("\nFOR - O tempo total foi: " + tempoTotal);
	}

	public void ForEach() {
		
		double tempoInicial, tempoFinal, tempoTotal;
		
		tempoInicial = System.nanoTime();
		for (int atual : numeros) {
			System.out.print(atual + " ");
			
		}
		tempoFinal = System.nanoTime();
		tempoTotal = tempoFinal - tempoInicial;
		tempoTotal /= Math.pow(10, 9);
		
		System.out.println("\nFOREACH - O tempo total foi: " + tempoTotal);
	}
}