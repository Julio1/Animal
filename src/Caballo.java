
public class Caballo implements Animal {

	
	private String nombre;
	private	String tipo;
	private int edad;
	static int cantCaballo=0;
	private int id;
	
	public Caballo (String pnombre, String ptipo,int pedad) {
	
		setNombre(pnombre);	
		setTipo(ptipo);
		setEdad(pedad);	
		setId();
	} 
	
	public Caballo () {
		
	
		setId();
	} 
	
	public void setId(){
		cantCaballo++;
		id=cantCaballo;
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
	
	
	public static int getCantCaballo() {
		return cantCaballo;
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
	    	result += "Cantidad de caballo: " +getCantCaballo()+  "\n";
	    	result += "ID del caballo: " + getId() +  "\n";
	    		    	

	    return result;

	    }


	
}
