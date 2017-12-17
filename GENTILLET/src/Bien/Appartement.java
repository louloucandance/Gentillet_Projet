package Bien;

import Bien.Bien.PointsCardinaux;

public class Appartement extends Bien {
	private int etage;
	private int nbPieces;
	private int chargesMensuelles;
	
	
	
	public Appartement(String adr, PointsCardinaux orient, int prix, String dispo, String vente, int num, int etage, int pieces, int charges) {
		this.adresse=adr;
		this.orientation=orient;
		this.prix=prix;
		this.dateDispo=dispo;
		this.dateVente=vente;
		this.numInterne=num;
		this.etage=etage;
		this.nbPieces=pieces;
		this.chargesMensuelles=charges;
		this.TypeBien=Terrain;
	}

//GETTERS ET SETTERS
	public int getEtage() {
		return etage;
	}
	public void setEtage(int etage) {
		this.etage = etage;
	}
	public int getNbPieces() {
		return nbPieces;
	}
	public void setNbPieces(int nbPieces) {
		this.nbPieces = nbPieces;
	}
	public int getChargesMensuelles() {
		return chargesMensuelles;
	}
	public void setChargesMensuelles(int chargesMensuelles) {
		this.chargesMensuelles = chargesMensuelles;
	}
	
	

}
