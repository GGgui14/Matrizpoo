
package tarefapoo21;

import java.util.Scanner;

public class Tarefapoo21 {
    public static void main(String[] args) {
        int[][] matriz = new int[6][6];
        Scanner ler = new Scanner(System.in);

        for(int linha=0 ; linha < 6 ; linha++){
                for(int coluna = 0; coluna < 6 ; coluna ++){
                    System.out.printf("Insira teu binario[%d][%d]: ",linha+1,coluna+1);
                    int valor = ler.nextInt();
                    while(valor!= 0 && valor != 1){
                        System.out.println("não é binario");
                        valor= ler.nextInt();
                    }
                    matriz[coluna][linha] = valor;
                }
        }
        System.out.println("\nA Matriz ficou: \n");
            for(int linha=0 ; linha < 6 ; linha++){
                for(int coluna = 0; coluna < 6 ; coluna ++){
                    System.out.printf("\t %d \t",matriz[linha][coluna]);
                }
                System.out.println();
            }
            
            int m =0;
            int mz = -1;
            for(int i=0 ; i < 6 ; i++){
                int w = 0;
                for(int j = 0; j < 6 ; j ++){
                    if(matriz[i][j]==0){
                        w++;
                    }
                }
                if(w>m){
                    m = w;
                    mz = i;
                } 
            }
            System.out.println("linha com maior quantidade de zeros é: "+ mz);
            
        System.out.println("Digite a quantidade de alunos:");
        int g = ler.nextInt();
        int media[][]= new int[g+1][4];
        String situacao[][]= new String[g][4];
        for(int linha=0 ; linha < g ; linha++){
            for(int coluna = 0; coluna < 2 ; coluna ++){
                System.out.printf("digite a nota do aluno:[%d]e a sua nota:[%d]: ",linha+1,coluna+1);
                media[linha][coluna] = ler.nextInt();
            }
        }

        for (int i = 0; i < g; i++) {
            media[i][2] = (media[i] [0] + media[i][1]) / 2;
            if (media[i][2] >= 60) {
                media[i][3] = 1; 
            } else {
                media[i][3] = 0; 
            }
            for (int j = 0; j < 4; j++) {
                situacao[i][j] = String.valueOf(media[i][j]);
            }
            if (situacao[i][3].equals("1")) {
                situacao[i][3] = "Aprovado";
            } else {
                situacao[i][3] = "Reprovado";
            }
        }
        
        System.out.println("Notas e situações dos alunos:");
        System.out.println("nota1\tnota2\tmedia\tsituação"); 
        for (int i = 0; i < g; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(situacao[i][j] + "\t");
            }
            System.out.println();
        }
        
        int[][] mat = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = (int) (Math.random() * 100);
            }
        }

        System.out.println("Matriz:");
        for (int[] linha : mat) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

        int maior = mat[0][0];
        int linhaMaior = 0;
        int colunaMaior = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (mat[i][j] > maior) {
                    maior = mat[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Linha do maior número: " + linhaMaior);
        System.out.println("Coluna do maior número: " + colunaMaior);

        int menor = mat[linhaMaior][0];
        int colunaMenor = 0;
        for (int j = 0; j < 5; j++) {
            if (mat[linhaMaior][j] < menor) {
                menor = mat[linhaMaior][j];
                colunaMenor = j;
            }
        }

        System.out.println("Menor número da linha do maior número: " + menor);
        System.out.println("Coluna do menor número: " + colunaMenor);
        
        
         int[][] dia = {
            {0, 12, 17, 9, 21},
            {15, 0, 21, 17, 13},
            {9, 21, 0, 6, 11},
            {9, 15, 8, 0, 13},
            {11, 30, 7, 10, 0}
        };
        int[] diagonal = new int[dia.length];

        for (int i = 0; i < dia.length; i++) {
            int min = Integer.MAX_VALUE;
            int produto = 1;
            for (int j = 0; j < dia[i].length; j++) {
                if (i != j) {
                    produto *= dia[i][j];
                    min = Math.min(min, dia[i][j]);
                }
            }
            diagonal[i] = produto / min;
        }

        System.out.println("Matriz original:");
        for (int i = 0; i < dia.length; i++) {
            for (int j = 0; j < dia[i].length; j++) {
                System.out.print(dia[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nValores da diagonal principal:");
        for (int i = 0; i < diagonal.length; i++) {
            System.out.println("Linha ["+ i +"]"+"["+i+"]:" + diagonal[i]);
        }
    }
}

