
import Bien.Bien;
import Bien.Bien.*;
import Bien.Maison;
import Bien.Bien.MoyenChauffage;
import Bien.Bien.PointsCardinaux;
import Client.Client;
import Client.Voeux;
import Client.VoeuxAppart;
import Client.VoeuxMaison;
import Client.VoeuxTerrain;
import Vente.Agence;


public class TimmoImmo {

	public static void main(String[] args) {
		Maison maisonBleue;
		maisonBleue = Bien.creerMaison("3, Rue Bleue", Bien.PointsCardinaux.OUEST, 123123, "12/07/2017", "12/07/2019", 1, 3, 8, Bien.MoyenChauffage.GAZ);
		System.out.println(maisonBleue);
		Client acheteur;
		acheteur = Client.creerClient("Dupont", "3 rue des lilas", 0612234556, "acheteur@mail.com");

	}

}
