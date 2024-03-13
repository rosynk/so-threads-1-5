
package view;

import controller.ThreadVetor;
import java.util.Random;

public class MainThreadVetor {
	public static void main(String[] args) {
		
    	int [] numeros = new int [1000];
        Random rand = new Random(); 
        
        for (int i = 0; i < numeros.length ; i++){
            numeros[i] = rand.nextInt(100) + 1;
            

         }
        
        Thread[] threads = new ThreadVetor[2];
        
        for (int j = 0 ; j < threads.length ; j++) {
        	threads[j] = new ThreadVetor(numeros, j);
        	threads[j].start();
        }
        
       // Thread threadVetor1 = new ThreadVetor(numeros,0 );
        //Thread threadVetor2 = new ThreadVetor(numeros,1 );
        
    }
}