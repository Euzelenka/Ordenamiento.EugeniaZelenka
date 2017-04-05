package seleccion;

public class Seleccion {
	Integer[] array;
	Integer size;
	
	public Seleccion() {
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
	
	//ORDENAMIENTO O(n^2)
	public void ordenamiento() {
		int posM = 0;
		for(int i=0; i<size; i++) {
			posM = i;
			for(int pos=i; pos<size; pos++) {
				if(array[pos] <= array[posM]) {
					posM = pos;
				}
			}
			Integer actual = array[i];
			array[i] = array[posM];
			array[posM] = actual;
		}
	}
	
}
