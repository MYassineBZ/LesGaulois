package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
				+ effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public void preparePotion() {
		Random x = new Random();
		int newForce = x.nextInt(effetPotionMin, effetPotionMax);
		if (newForce > 7) {
			System.out.println("Jai prepare une super potion de force");
		} else {
			System.out
					.println("je n'ai pas trouver tous les ingredients, ma potion est seulement de force: " + newForce);
		}
		setForcePotion(newForce);

	}

	public void booster(Gaulois gaulois) {
		if (gaulois.getNom() == "Obelix") {
			parler("Non, Obélix !... Tu n’auras pas de potion magique ! ");
		} else {
			gaulois.boirePotion(getForcePotion());
		}
	}

	public int getForcePotion() {
		return forcePotion;
	}

	public void setForcePotion(int forcePotion) {
		this.forcePotion = forcePotion;
	}

	public static void main(String[] args) {
		Druide panaromix = new Druide("Panaromix", 5, 10);
		panaromix.preparePotion();
	}
}