
public class Perro implements Animal {

	
	private String nombre;
	private	String tipo;
	private int edad;
	static int cantPerro=0;
	private int id;
	
	public Perro (String pnombre, String ptipo,int pedad) {
	
		setNombre(pnombre);	
		setTipo(ptipo);
		setEdad(pedad);	
		setId();
	} 
	
	public Perro () {
		
	
		setId();
	} 
	
	public void setId(){
		cantPerro++;
		id=cantPerro;
	}
	
	public void setTipo(String ptipo) {
		tipo=ptipo;		
	}
	
	public void setNombre(String pnombre) {
		nombre=pnombre;		
	}
	

	public String getTipo() {
		// TODO Auto-generated method stub
		return tipo;
	}

	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public static int getCantPerro() {
		return cantPerro;
	}

	public static void setCantCaballo(int cantCaballo) {
		Caballo.cantCaballo = cantCaballo;
	}

	
	   public String toString(){

	    	String result;
	    	
	    	result = "*****Informacion del Animal****** " +  "\n";
	    	result += "Nombre: " + getNombre() +  "\n";
	    	result += "Tipo: " + getTipo() +  "\n";
	    	result += "Edad: " + getEdad() +  "\n";
	    	result += "Cantidad de caballo: " +getCantPerro()+  "\n";
	    	result += "ID del caballo: " + getId() +  "\n";
	    		    	

	    return result;

	    }


	
}
