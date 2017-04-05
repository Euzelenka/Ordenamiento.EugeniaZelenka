package quickSort;

import java.util.Date;

public class Main {
			public static void main(String[] args) {
				QuickSort a = new QuickSort();
				
				for(int i=0; i<1000; i++) {
					a.agregar((int)(Math.random()*100));
				}
				
				System.out.println(a.toString());
				
				Date v_start = new Date();
				a.ordenamiento();
				Date v_end = new Date();
				
				System.out.println(a.toString());
				System.out.println("Tiempo de Ejecución de QuickSort: " + (v_end.getTime() - v_start.getTime()));
			}
		}
