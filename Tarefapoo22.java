
package tarefapoo22;

import java.util.Random;
import java.util.Scanner;

public class Tarefapoo22 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] m = new int[12][12];
        Random rand = new Random();
        int linha;
        String T;
        System.out.println("Digite qual linha sera usada: \nDigite qual se sera a equação 'S' para soma, e 'M' para media:  ");
        linha = ler.nextInt();
        T = ler.next();
        if (linha < 0 || linha > 11) { 
            System.out.println("Linha inválida. O programa será encerrado.");
            System.exit(0); 
        }
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                m[i][j] = rand.nextInt(100);
            }
        }
        System.out.println("\n");
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.printf("%d ", m[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n");
        int resultado = 0; 
        for (int j = 0; j < 12; j++) { 
            resultado += m[linha][j]; 
        }
        if (T.equals("s")) {
            System.out.printf("\nA soma dos valores da linha %d é %d\n", linha, resultado); 
        } 
        else if (T.equals("m")) {
            double media = resultado / 12.0; 
            System.out.printf("\nA média dos valores da linha %d é %.2f\n", linha, media); 
        }
        else {
            System.out.println("Equação inválida. O programa será encerrado.");
             
        }
        System.out.println("____________________________________________________");

        int[][] matriz = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = rand.nextInt(11);
            }
        }
        System.out.println("\n");
        System.out.println("Terceira coluna da matriz:");
        for (int i = 0; i < 3; i++) {
            System.out.println(matriz[i][2]);
        }
        System.out.println("\nMatriz completa:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("____________________________________________________");
        
        int[][] red = new int[5][5];
        
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                red[i][j] = rand.nextInt(100);
            }
        }
        
        int maior = red[0][0];
        int menor = red[0][0];
        
        System.out.println("\nMatriz completa:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(red[i][j] + " ");
            }
            System.out.println();
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (red[i][j] > maior) { 
                    maior = red[i][j]; 
                }
                if (red[i][j] < menor) { 
                    menor = red[i][j]; 
                }
            }
        }
        System.out.println("\nO maior valor da matriz é: " + maior);
        System.out.println("O menor valor da matriz é: " + menor);
        
        System.out.println("____________________________________________________");
        
        int[][] des = new int[6][3];

        System.out.println("Elementos da matriz 6 x 3:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                des[i][j] = rand.nextInt(100) + 1; 
                System.out.print(des[i][j] + " "); 
            }
            System.out.println(); 
        }

        int[][] parte1 = new int[3][3];
        int[][] parte2 = new int[3][3];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                if (i < 3) { 
                    parte1[i][j] = des[i][j]; 
                } 
                else { 
                    parte2[i - 3][j] = des[i][j]; 
                }
            }
        }

        System.out.println("Primeira parte da matriz:");
        for(int i = 0; i < parte1.length; i++) {
            for (int j = 0; j < parte1[i].length; j++) {
                System.out.print(parte1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Segunda parte da matriz:");
        for(int i = 0; i < parte2.length; i++) {
            for (int j = 0; j < parte2[i].length; j++) {
                System.out.print(parte2[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("____________________________________________________");
        
        char[][] riz = new char[5][10];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                int cod = rand.nextInt(26) + 97;
                riz[i][j] = (char) cod;
            }
        }
        System.out.println("A matriz gerada é:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(riz[i][j] + " ");
            }
            System.out.println();
        }

        int contador = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (riz[i][j] == 'a') {
                    contador++;
                }
            }
        }

        System.out.println("A matriz tem " + contador + " letras \"a\".");
        //na linha 153 gera um número aleatório entre 97 e 122 códigos ASCII das letras minúsculas e depois o converte em um caractere e o armazena na matriz
        System.out.println("____________________________________________________");
        
        int[] v1 = new int[10];
        int[] v2 = new int[10];
        int[] v3 = new int[10];
        int[][] mer = new int[10][3];

        for (int i = 0; i < 10; i++) {
            v1[i] = (int) (rand.nextDouble() * 10);
        }
        for (int i = 0; i < 10; i++) {
            v2[i] = (int) (rand.nextDouble() * 10);
        }
        for (int i = 0; i < 10; i++) {
            v3[i] = (int) (rand.nextDouble() * 10);
        }

        System.out.println("O valor do vetor 1 é:");
        for (int i = 0; i < 10; i++) {
            System.out.print(v1[i] + " ");
        }
        System.out.println();

        System.out.println("O valor do vetor 2 é:");
        for (int i = 0; i < 10; i++) {
            System.out.print(v2[i] + " ");
        }
        System.out.println();

        System.out.println("O valor do vetor 3 é:");
        for (int i = 0; i < 10; i++) {
            System.out.print(v3[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            mer[i][0] = v1[i];
            mer[i][1] = v2[i];
            mer[i][2] = v3[i];
        }

        System.out.println("\nA Matriz gerada é:");
        System.out.println("v1 v2 v3");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mer[i][j] + " ");
            }
            System.out.println();
        }
    }
}
