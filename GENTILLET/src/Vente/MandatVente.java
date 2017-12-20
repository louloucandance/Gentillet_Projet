package Vente;

public class MandatVente {
	private String dateSouhaitee;
	private int prixSouhaite;
	private int duree;
	
	MandatVente(String date, int prix, int temps) {
		this.dateSouhaitee=date;
		this.duree=temps;
		this.prixSouhaite=prix;
	}
	
	public MandatVente creerMandatVente(String date, int prix, int temps) {
		return new MandatVente(date, prix, temps);
	}
	

}
