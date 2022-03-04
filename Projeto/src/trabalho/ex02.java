package trabalho;

public class ex02 {

	public static void main(String[] args) {

		int[] n = {1,5,3,4,2};
		int x = 2;
		
		System.out.println(pares(n, x));
	}
	
	public static int pares(int[] vetor, int numero) {
		
		int contador = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			for(int j = 0; j < i; j++) {
				
				if((Math.abs(vetor[i] - vetor[j]) == numero) && i != j) {
					contador++;
				}
			}
		}
		return contador;
	}
}	
	
	
