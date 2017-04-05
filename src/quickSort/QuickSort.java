package quickSort;

public class QuickSort {
	Integer[] array;
	Integer size;
	
	public QuickSort() {
		array = new Integer[1000];
		size = 1000;
	}
	
	public String toString() {
		String datos = " ";
		for(int i=0; i<size; i++) {
			datos += array[i] + " ";
		}
		return datos;
	}
	
	public void agregar(Integer dato) {
		int i = 0;
		while(i<size) {
			if(array[i] == null){
				array[i] = dato;
				i = size;
			}
			i++;	
		}
	}
	
	public void ordenamiento() {
		quickSort(0, size-1);
	}
	
	public int calculaposPivote(int inicio, int fin) {
		return (inicio + (fin-inicio)/2);
		 
	}
	
	//COMPLEJIDAD  EL PEOR CASO:O(n^2)  EL MEJOR CASO:O(nLOGn)
	/*  LA COMPLEJIDAD VARÍA DEPENDIENDO DEL PIVOTE QUE SE ELIJA  */
	
	public void quickSort(int inicio, int fin) {
		int i = inicio;
		int j = fin;
		int posPivote = calculaposPivote(inicio,fin);
		
		while(array[i] < array[posPivote])
			i++;
		while(array[j] > array[posPivote])
			j--;
		
		if(i <= j) {
			Integer aux = array[i];
			array[i] = array[j];
			array[j] = aux;
			i++;
			j--;
 		}
		if(inicio < j)
			quickSort(inicio, j);
		if(i < fin)
			quickSort(i,fin);
	}
	
}

