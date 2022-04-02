package defaultt;

public class PersonaMain {
	public static void main(String[] args) {

		Persona p = new Adulto("Marco", "Ernie", 35, 4);
		
		p.etaCane(p.getEta());
		System.out.println(p.toString());
		
	}
}
