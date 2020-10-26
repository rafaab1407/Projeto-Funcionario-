public class BubbleSortMelhorado {
  public static void main(String args[]) {
    int[] v = {5,4,1,3,2};
 
    BubbleSortMelhorado bs = new BubbleSortMelhorado();
    bs.ordenar(v);
    for(int num : v) {
      System.out.print(num + " ");
    }
  }
  
  /**
   * Método que ordena um vetor de inteiros utilizando o algoritmo
   * de Bubble Sort.
   * 
   * @param v - Vetor que será ordenado.
   */
  public void ordenar(int[] v) {
  
  int comparacoes = 0;
    /* for utilizado para controlar a quantidade de vezes que o vetor será
	   ordenado. */
    for(int i = 0; i < v.length - 1; i++) {
      // Variavel utilizada para controlar se o vetor ja está ordenado.
      boolean estaOrdenado = true;
      // for utilizado para ordenar o vetor.
      for(int j = 0; j < v.length - 1 - i; j++) {
        /* Se o valor da posição atual do vetor for maior que o proximo valor,
          então troca os valores de lugar no vetor. */
          comparacoes++;
        if(v[j] > v[j + 1]) {
          int aux = v[j];
          v[j] = v[j + 1];
          v[j + 1] = aux;
          estaOrdenado = false;
        }
      }
      // Se o vetor está ordenado então para as iterações sobre ele.
      if(estaOrdenado)
        break;
    }
    
    System.out.println(comparacoes);
  }
}