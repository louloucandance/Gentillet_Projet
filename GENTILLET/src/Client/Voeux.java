package Client;

public abstract class Voeux{
	public int prix;
	public String localisation;
	
	Voeux creerMaison(int prix, String local, int surface, int nbPieces) {
		return new VoeuxMaison(prix, local, surface, nbPieces);
	}
	
	//GETTERS AND SETTERS
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	
	
	

}
