
/**
 * @(#)Ubicacion.java
 *
 *
 * @author Julio C. Moreira
 * @version 1.00 2013-3-2
 */



import java.io.*;
import java.util.ArrayList;


public class Main{

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream out = System.out;
	public static ArrayList<Caballo> listaCaballos= new ArrayList<Caballo>();

	public static void main(String[] args)throws java.io.IOException{

	
//	Caballo miCaballo= new Caballo ("Justo Orozco", "Pura Sangre", 12);
////	
////	 out.println(miCaballo.toString());
////	
////	 Caballo miCaballo= new Caballo ();
//		
//		out.println(miCaballo.getNombre());
////        
////		Caballo miCaballo= new Caballo ("Justo Orozco", "Pura Sangre");
//		out.println(miCaballo.toString());
		
		Caballo miCaballo= new Caballo ("Juo", "Pura Sangre", 12);
		Caballo desampa= new Caballo ("Raiam", "Callejero", 69);
		Caballo aserri= new Caballo ("Juo", "Piedrota", 20);
		out.println(miCaballo.toString());
		out.println(desampa.toString());
		out.println(aserri.toString());
		
		listaCaballos.add(miCaballo);
		listaCaballos.add(desampa);
		listaCaballos.add(aserri);
		
		
		
		
		String msj;
		int edadCaballoMayor = 0;
		int idCaballoMayor = 0;
		int edad = 0;
		
		
		for(int i=0;i<listaCaballos.size();i++){
			
			Caballo caballoRevisado;	
			caballoRevisado = (Caballo)listaCaballos.get(i); //
							
			if(caballoRevisado.getEdad()> edad){//
				idCaballoMayor=caballoRevisado.getId();
				edad=caballoRevisado.getEdad();
				
			}
				
		}
		
		out.println("El ID del caballo mayor es: " + idCaballoMayor+ " y su edad es: " +edad);
			
	

}
}
