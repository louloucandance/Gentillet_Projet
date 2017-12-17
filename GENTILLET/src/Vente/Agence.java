package Vente;

public class Agence {
	Hashmap<Integer, Bien> catalogue=new Hashmap<>;
	private String nom;
	
	public Agence(String nom) {
		this.nom=nom;
	}
	public creerAgence(String nom){
		return new Agence(nom);
	}
	
	public void choisirBien(Voeux souhait) {
		if(souhait instanceof VoeuxMaison) {
			for(Bien b : catalogue) {
				if (b.type == Maison && b.surface == souhait.surface && b.nbPieces == souhait.surface && b.localisation==souhait.localisation && b.prix==voeux.prix) {
					System.out.println("La maison "+b.numInterne+" correspond à votre recherche");
				}
			}
		}
		
		if(souhait instanceof VoeuxAppartement) {
			for(Bien b : catalogue) {
				if (b.type == Appartement && b.nbPieces == souhait.surface && b.localisation==souhait.localisation && b.prix==voeux.prix) {
					System.out.println("L'appartement "+b.numInterne+" correspond à votre recherche");
				}
			}
		}
		
		if(souhait instanceof VoeuxTerrain) {
			for(Bien b : catalogue) {
				if (b.type == Terrain && b.surface == souhait.surface  && b.localisation==souhait.localisation && b.prix==voeux.prix) {
					System.out.println("La terrain "+b.numInterne+" correspond à votre recherche");
				}
			}
		}
		
		
		
	}

}
