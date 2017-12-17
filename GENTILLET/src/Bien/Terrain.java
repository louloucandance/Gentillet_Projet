package Bien;

import Bien.Bien.PointsCardinaux;

public class Terrain extends Bien {
	private int surfaceSol;
	private int longueurFacade;
	
	public Terrain(String adr, PointsCardinaux orient, int prix, String dispo, String vente, int num, int surface, int longueur) {
		this.adresse=adr;
		this.orientation=orient;
		this.prix=prix;
		this.dateDispo=dispo;
		this.dateVente=vente;
		this.numInterne=num;
		this.longueurFacade=longueur;
		this.surfaceSol=surface;
		this.TypeBien=Terrain;
	}

	public int getSurfaceSol() {
		return surfaceSol;
	}

	public void setSurfaceSol(int surfaceSol) {
		this.surfaceSol = surfaceSol;
	}

	public int getLongueurFacade() {
		return longueurFacade;
	}

	public void setLongueurFacade(int longueurFacade) {
		this.longueurFacade = longueurFacade;
	}


}
