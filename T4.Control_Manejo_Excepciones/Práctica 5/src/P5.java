
public class P5 {
	
	public static void main(String[] args) {
		Persona p = new Persona();
		
		try {
			p.setEdad(-5);
		} catch(IllegalArgumentException iae) {
			iae.printStackTrace();
		}
		
		System.out.println("La edad es: "+p.getEdad()); 
	}
}
