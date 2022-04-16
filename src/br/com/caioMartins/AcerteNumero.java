package br.com.caioMartins;

import java.util.Random;
import java.util.Scanner;

public class AcerteNumero {

    public static void main(String[] args) {
	// write your code here
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        boolean numErrado = true;
        int numCorreto = random.nextInt(10);
        int tentativa = 0;
        int tentativas = 0;

        System.out.println("Digite um número: ");
        tentativa = entrada.nextInt();

        while (numErrado) {

            tentativas++;

            if (tentativa == numCorreto){
                System.out.println("Parabens, você acertou em "+ tentativas + " tentativas!");
                numErrado = false;
            } else if (tentativa < numCorreto){
                System.out.println("Tente um número maior.");
                tentativa = entrada.nextInt();
            } else {
                System.out.println("Tente um número menor.");
                tentativa = entrada.nextInt();
            }

        }

    }
}
