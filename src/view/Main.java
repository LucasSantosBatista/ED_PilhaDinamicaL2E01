package view;

import controller.PilhaInt;

public class Main {
	public static void main(String[] args) {
		PilhaInt p = new PilhaInt();
		int[] vetor = { 100, 200, 1, 50, 39, 44, 25, 16, 99, 45, 33, 18, 102, 92 };
		int tamanhoVetor = vetor.length;
		int v1 = 0;

		for (int i = 0; i < tamanhoVetor; i++) {
			if (p.isEmpty()) {
				p.push(vetor[i] - 10);
			} else if (vetor[i] % 5 == 0) {
				p.push(vetor[i] / 5);
			} else if (vetor[i] % 3 == 0) {
				p.push(vetor[i] * 3);
			} else {
				v1 = p.pop();
				System.out.println(v1 / 2);
			}
		}

		System.out.println(v1 / 2);

	}
}
