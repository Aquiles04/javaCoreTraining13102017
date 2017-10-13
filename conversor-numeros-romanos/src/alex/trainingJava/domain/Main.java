package alex.trainingJava.domain;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Faca um programa que receba um numero romano ( de I a VIII) e apresente na tela sua forma decimal.
        // I = 1
        // V = 5
        // X = 10

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Insira valor em numero Romano");
            String valor = sc.nextLine();
            int resultado = 0;
            char anterior = 'c';

            for (char c : valor.toCharArray()) {

                switch (c) {

                    case 'L':
                        if (anterior == 'c') {
                            resultado += 50;
                            break;
                        }
                        resultado += 30;
                        anterior = c;
                        break;

                    case 'X':
                        if (anterior == 'I') {
                            resultado += 8;
                            break;
                        }
                        resultado += 10;
                        anterior = c;
                        break;

                    case 'V':
                        if (anterior == 'I') {
                            resultado += 3;
                            break;
                        }
                        resultado += 5;
                        anterior = c;

                        break;

                    case 'I':
                        resultado += 1;
                        anterior = c;

                        break;

                    default:
                        break;
                }

            }

            System.out.println("A forma decimal de " + valor + " é " + resultado);
        }

    }

}
