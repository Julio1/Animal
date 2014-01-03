
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


public class Main4{

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream out = System.out;
	public static ArrayList<Caballo> listaCaballos= new ArrayList<Caballo>();

	public static void main(String[] args)throws java.io.IOException{

	

		
		Caballo miCaballo= new Caballo ("Juo", "Pura Sangre", 12);
		Caballo desampa= new Caballo ("Raiam", "Callejero", 1);
		Caballo aserri= new Caballo ("Juo", "Piedrota", 20);
		
		listaCaballos.add(miCaballo);
		listaCaballos.add(desampa);
		listaCaballos.add(aserri);
		out.println(caballoMasGrande ());
		

	}
	
	public static String caballoMasGrande (){
		
		String msj;
		
		int idCaballoMayor = 0;
		int idCaballoMenor = 0;
		int edadMayor = 0;
		int edadMenor = 0;
		
		
		
		Iterator<Caballo> elIterador = (Iterator<Caballo>) listaCaballos.iterator();
		while(elIterador.hasNext())	{
		   
			Caballo caballoRevisado = (Caballo) elIterador.next();
			if(caballoRevisado.getEdad()> edadMayor){
				idCaballoMayor=caballoRevisado.getId();
				edadMayor=caballoRevisado.getEdad();
				
				
			}
			
			if (caballoRevisado.getId()==1){
				idCaballoMenor=caballoRevisado.getId();
				edadMenor=caballoRevisado.getEdad();
				
			}else if (caballoRevisado.getEdad()< edadMenor ) {
				idCaballoMenor=caballoRevisado.getId();
				edadMenor=caballoRevisado.getEdad();
			}
				
		}

		 msj="El ID del caballo mayor es: " + idCaballoMayor+ " y su edad es: " +edadMayor +"\n";
		 msj+="El ID del caballo menor es: " + idCaballoMenor+ " y su edad es: " +edadMenor +"\n";
		return msj;	
		}
}
