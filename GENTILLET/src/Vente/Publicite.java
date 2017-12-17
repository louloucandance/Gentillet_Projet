package Vente;

public class Publicite {
	private Media media;
	private String description;
	//fichier ?
	
	public enum Media{
		PRESSE_LOCALE,
		PRESSE_SPECIALISEE,
		INTERNET,
		TELE,
		RADIO;
	}

}
