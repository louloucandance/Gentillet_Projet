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

	public int getSurface() {
		return surface;
	}

	public void setSurface(int surface) {
		this.surface = surface;
	}

	public int getNbPieces() {
		return nbPieces;
	}

	public void setNbPieces(int nbPieces) {
		this.nbPieces = nbPieces;
	}
	



}
