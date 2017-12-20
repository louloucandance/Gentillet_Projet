package Vente;

import Bien.Bien;
import Client.Client;


public class Visite {
	private String date;
	private Client client;
	private Bien bien;
	public Visite(String jour, Client c, Bien b){
		this.date=jour;
		this.client=c;
		this.bien=b;
	}
	
	public Visite creerVisite(String j, Client c, Bien b) {
		return new Visite(j, c, b);
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Bien getBien() {
		return bien;
	}

	public void setBien(Bien bien) {
		this.bien = bien;
	}
	

}
