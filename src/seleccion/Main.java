package seleccion;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Seleccion a = new Seleccion();
				
		for(int i=0; i<1000; i++) {
			a.agregar((int)(Math.random()*100));
		}
		
		System.out.println(a.toString());
		
		 Date v_start = new Date();
		a.ordenamiento();
		 Date v_end = new Date();
		
		System.out.println(a.toString());
		System.out.println("Tiempo de Ejecución de Seleccion: " + (v_end.getTime() - v_start.getTime()));
	}
}
