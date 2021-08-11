package desafio01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int divisores;
        int contador = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int numero = entrada.nextInt();

        for(divisores = 1; divisores <= numero; divisores++) {
            if( (numero % divisores) == 0)
                ++contador;
        }

        if( contador == 2 ) {
            System.out.println("O número: " + numero + " é primo");
        } else {
            System.out.println("O número: " + numero + " não é primo");
        }

    }
}




