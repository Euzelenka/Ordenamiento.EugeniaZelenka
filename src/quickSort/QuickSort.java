package quickSort;

import java.util.Stack;

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
	
	public int partition(int inicio, int fin) {
		int pivote = array[fin];
		int i = inicio-1;
		for(int j=inicio; j<fin; j++) {
			if(array[j] <= pivote) {
				i = i+1;
				Integer aux = array[i];
				array[i] = array[j];
				array[j] = aux;
			}		
		}
		
		Integer aux = array[i+1];
		array[i+1] = array[fin];
		array[fin] = aux;	
		return i+1;
	}
	
	public void quickSortIterative() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		stack.push(array.length);
		while(!stack.isEmpty()) {
			int end = stack.pop();
			int start = stack.pop();
			if((end > start) ) {	
				int p = partition(start, end);
				stack.push(p+1);
				stack.push(end);
			
				stack.push(start);
				stack.push(p);
			}	
		}
	}
	
	//COMPLEJIDAD  EL PEOR CASO:O(n^2)  EL MEJOR CASO:O(nLOGn)
	/*  LA COMPLEJIDAD VARÍA DEPENDIENDO DEL PIVOTE QUE SE ELIJA  */
	public void quickSort(int inicio, int fin) {
		if(inicio < fin) {
			int p = partition(inicio,fin);
			quickSort(inicio, p-1);
			quickSort(p+1, fin);
		}
	}
}