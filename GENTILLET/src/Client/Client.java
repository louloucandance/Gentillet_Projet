package Client;

public class Client {
	public String nom;
	public String adresse;
	public int telephone;
	public String mail;
	
	public Client(String nom, String adr, int tel, String mail) {
		this.nom=nom;
		this.adresse=adr;
		this.telephone=tel;
		this.mail=mail;
	}
	
	//Factory client :
	public Client creerClient(String nom, String adr, int tel, String mail) {
		return new Client(nom, adr, tel, mail);
	}
	public Entreprise creerEntreprise(String nom, String adr, int tel, String mail, int siren, String jur) {
		return new Entreprise(nom, adr, tel, mail, siren, jur);
	}
	
	//GETTERS ET SETTERS
	public String getNom() {
		return nom;
	}	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}
