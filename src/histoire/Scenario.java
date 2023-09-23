package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Romain minus;
		minus = new Romain("Minus", 6);
		Gaulois asterix;
		asterix = new Gaulois("Asterix", 8);
		Gaulois obelix;
		obelix = new Gaulois("Obelix", 25);
		Druide paronamix;
		paronamix = new Druide("Paronamix", 5, 10);
		paronamix.parler("Bonjour, je suis le druide Panoramix et ma potion peut aller dune force 5 à 10.");
		paronamix.parler("Je vais aller preparer une petite potion");
		paronamix.preparePotion();
		paronamix.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		paronamix.booster(asterix);
		asterix.parler("bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);

	}

}
