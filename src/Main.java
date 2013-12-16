
/**
 * @(#)Ubicacion.java
 *
 *
 * @author Julio C. Moreira
 * @version 1.00 2013-3-2
 */



import java.io.*;

public class Main{

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream out = System.out;


	public static void main(String[] args)throws java.io.IOException{

//	
//	Caballo miCaballo= new Caballo ("Justo Orozco", "Pura Sangre");
//	
//	 out.println(miCaballo.toString());
//	
//		Caballo miCaballo= new Caballo ();
		
		out.println(Caballo.edad);
        
		Caballo miCaballo= new Caballo ("Justo Orozco", "Pura Sangre");
		out.println(miCaballo.toString());
}

}
