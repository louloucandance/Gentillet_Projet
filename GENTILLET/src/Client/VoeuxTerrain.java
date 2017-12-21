package Client;

public class VoeuxTerrain extends Voeux  {
	private int surface;

	public VoeuxTerrain(int prix, String local, int surface) {
		this.surface=surface;
		this.localisation=local;
		this.prix=prix;
	}

	public int getSurface() {
		return surface;
	}

	public void setSurface(int surface) {
		this.surface = surface;
	}
}
