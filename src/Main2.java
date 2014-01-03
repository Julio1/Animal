
/**
 * @(#)Ubicacion.java
 *
 *
 * @author Julio C. Moreira
 * @version 1.00 2013-3-2
 */



import java.io.*;
import java.util.ArrayList;


public class Main2{

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream out = System.out;
	public static ArrayList<Caballo> listaCaballos= new ArrayList<Caballo>();

	public static void main(String[] args)throws java.io.IOException{

	

		
		Caballo miCaballo= new Caballo ("Juo", "Pura Sangre", 12);
		Caballo desampa= new Caballo ("Raiam", "Callejero", 69);
		Caballo aserri= new Caballo ("Juo", "Piedrota", 20);
		
		listaCaballos.add(miCaballo);
		listaCaballos.add(desampa);
		listaCaballos.add(aserri);
		out.println(caballoMasGrande ());
		

	}
	
	public static String caballoMasGrande (){
		
		String msj;
		int edadCaballoMayor = 0;
		int idCaballoMayor = 0;
		int edad = 0;
		
		
		for(int i=0;i<listaCaballos.size();i++){
			
			Caballo caballoRevisado;	
			caballoRevisado = (Caballo)listaCaballos.get(i); //
							
			if(caballoRevisado.getEdad()> edad){
				idCaballoMayor=caballoRevisado.getId();
				edad=caballoRevisado.getEdad();
				
			}
				
		}
		
	return msj="El ID del caballo mayor es: " + idCaballoMayor+ " y su edad es: " +edad;
			
		}
}
