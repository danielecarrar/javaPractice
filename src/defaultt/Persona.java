package defaultt;

public class Persona {

	protected String nome;
	protected String cognome;
	protected Integer eta;

	public Persona(String nome, String cognome, Integer eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public Integer getEta() {
		return eta;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setEta(Integer eta) {
		this.eta = eta;
	}

	@Override
	public String toString() {
		return "INFO: nome= " + nome + ", cognome= " + cognome + ", eta= " + eta;
	}

	public int etaCane(int eta) {
		eta *= 7;
		System.out.println("se la persona fosse un cane, avrebbe " + eta + " anni!");
		return eta;
	}

}
