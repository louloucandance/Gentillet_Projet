package Bien;

import Bien.Bien.PointsCardinaux;
import Bien.Bien.TypeBien;

public class Maison extends Bien {
	private int nbEtage;
	private int nbPieces;
	private int surfaceHabitable;
	private MoyenChauffage chauffage;
	
	public Maison(String adr, PointsCardinaux orient, int prix, String dispo, String vente, int num, int etage, int pieces, MoyenChauffage chauff) {
		this.adresse=adr;
		this.orientation=orient;
		this.prix=prix;
		this.dateDispo=dispo;
		this.dateVente=vente;
		this.numInterne=num;
		this.nbEtage=etage;
		this.nbPieces=pieces;
		this.chauffage=chauff;
		this.type=type.Maison;
	}

	public int getNbEtage() {
		return nbEtage;
	}

	public void setNbEtage(int nbEtage) {
		this.nbEtage = nbEtage;
	}

	public int getNbPieces() {
		return nbPieces;
	}

	public void setNbPieces(int nbPieces) {
		this.nbPieces = nbPieces;
	}

	public int getSurfaceHabitable() {
		return surfaceHabitable;
	}

	public void setSurfaceHabitable(int surfaceHabitable) {
		this.surfaceHabitable = surfaceHabitable;
	}

	public MoyenChauffage getChauffage() {
		return chauffage;
	}

	public void setChauffage(MoyenChauffage chauffage) {
		this.chauffage = chauffage;
	}

}
