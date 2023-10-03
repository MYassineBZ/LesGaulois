package personnages;

public class Gaulois {
	private String nom;
	private int effetPotion = 1;
	private int force, nbTrophees;
	private Equipement[] trophees = new Equipement[100];

	public int getEffetPotion() {
		return effetPotion;
	}

	public int getForce() {
		return force;
	}

	public void setEffetPotion(int effetPotion) {
		this.effetPotion = effetPotion;
	}

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

//	private String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
//		romain.recevoirCoup(force / 3 * getEffetPotion());
//	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] trophee = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophee != null && i < trophees.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = trophees[i];
		}
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public void boirePotion(int forcePotion) {
		setEffetPotion(forcePotion);
		parler("Merci Druide, je sens que ma force est: " + forcePotion + " fois decuplee");
	}

	public static void main(String[] args) {
		Gaulois asterix;
		Romain romain;
		romain = new Romain("Romain", 7);
		asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix);
		asterix.parler("bara mrigl chedli rohek");
		System.out.println(asterix.prendreParole());
		asterix.boirePotion(10);
		asterix.frapper(romain);

	}
}
