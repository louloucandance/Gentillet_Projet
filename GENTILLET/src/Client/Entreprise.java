package Client;

public class Entreprise extends Client {
	private int siren;
	private String formeJuridique;
	
	public Entreprise(String nom, String adr, int tel, String mail, int siren, String jur) {
		this.nom=nom;
		this.adresse=adr;
		this.telephone=tel;
		this.mail=mail;
		this.siren=siren;
		this.formeJuridique=jur;
	}

	public int getSiren() {
		return siren;
	}

	public void setSiren(int siren) {
		this.siren = siren;
	}

	public String getFormeJuridique() {
		return formeJuridique;
	}

	public void setFormeJuridique(String formeJuridique) {
		this.formeJuridique = formeJuridique;
	}
	
	

}
