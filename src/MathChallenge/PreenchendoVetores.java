/*Faça um programa que leia um valor T e preencha um vetor N[1000] com a sequência de valores de 0 até T-1 repetidas vezes, conforme exemplo abaixo. Imprima o vetor N.

Entrada
A entrada contém um valor inteiro T (2 ≤ T ≤ 50).

Saída
Para cada posição do vetor, escreva "N[i] = x", onde i é a posição do vetor e x é o valor armazenado naquela posição.

 
Exemplo de Entrada	Exemplo de Saída
3

N[0] = 0
N[1] = 1
N[2] = 2
N[3] = 0
N[4] = 1
N[5] = 2
N[6] = 0
N[7] = 1
N[8] = 2
...*/

package MathChallenge;
import java.util.Scanner;


public class PreenchendoVetores {
	public static void main(String[] args) {
		int T, i,j;
		int N[] =new int[1000];
		try (Scanner input = new Scanner(System.in)) {
			T =input.nextInt();
		}
		for ( i = 0,j = 0; i < 1000; j++,i++) {
			N[j] = j;
			if ((N[j]) == T) {
				j = 0;
			}
			System.out.print("N["+i+"] = "+N[j]+"\n");
		}
	}
}


