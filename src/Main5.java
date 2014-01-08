
/**
 * @(#)Ubicacion.java
 *
 *
 * @author Julio C. Moreira
 * @version 1.00 2013-3-2
 */



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;


public class Main5{

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream out = System.out;
	public static ArrayList<Animal> listaAnimal= new ArrayList<Animal>();

	public static void main(String[] args)throws java.io.IOException{

	

		
		Caballo miCaballo= new Caballo ("Juo", "Pura Sangre", 50);
		Perro   miPerro = new Perro ("Satanas", "Zaguate", 30);
		Caballo tuCaballo= new Caballo ("Cesc", "Pelcheron", 12);
		Perro   tuPerro = new Perro ("Samael", "Collie", 98);
		
		
		listaAnimal.add(miCaballo);
		listaAnimal.add(miPerro);
		listaAnimal.add(tuCaballo);
		listaAnimal.add(tuPerro);
		
		
		Iterator<Animal> miIterador = (Iterator<Animal>)listaAnimal.iterator();
		
		while (miIterador.hasNext()) {
			
			out.println((Animal) miIterador.next());
		}
		
		
//		out.println(listaAnimal);
		

	}
	
}
