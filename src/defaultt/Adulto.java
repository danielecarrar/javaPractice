package defaultt;

public class Adulto extends Persona {

	protected Integer numeroAnimali;
	
	
	public Adulto(String nome, String data, Integer eta, Integer numeroAnimali) {
		super(nome, data, eta);
		this.numeroAnimali=numeroAnimali;
		
	}


	@Override
	public String toString() {
		
		return super.toString() + ", numero animali= " + this.numeroAnimali;
	}


}
