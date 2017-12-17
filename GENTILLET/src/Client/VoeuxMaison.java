package Client;

public class VoeuxMaison extends Voeux  {
	private int surface;
	private int nbPieces;

	public VoeuxMaison(int prix, String local, int surface, int nbPieces) {
		this.surface=surface;
		this.nbPieces=nbPieces;
		this.localisation=local;
		this.prix=prix;
	}
	



}
