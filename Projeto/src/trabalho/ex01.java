package trabalho;

public class ex01 {

	public static void main(String[] args) {

		int aux, mediana, esq, meio, dir;
		boolean controle;
		int vetor[] = { 9, 2, 1, 4, 6};

		for (int i = 0; i < vetor.length; ++i) {
			controle = true;
			for (int j = 0; j < (vetor.length - 1); ++j) {

				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
					controle = false;
				}
			}
			if (controle) {
				break;
			}

		}
		for (int i = 0; i < vetor.length; ++i) {
			System.out.print(vetor[i] + " ");
		}

		esq = 0;
		dir = vetor.length - 1;
		meio = (esq + dir) / 2;
		mediana = vetor[meio];

		System.out.printf("\n");
		System.out.println("O resultado da mediana é " + mediana);

	}

}

