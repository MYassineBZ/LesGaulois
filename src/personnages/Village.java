package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public Chef getChef() {
		return chef;
	}

	public String getNom() {
		return nom;
	}

	public Gaulois[] getVillageois() {
		return villageois;
	}

	public void ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois < villageois.length) {
			villageois[nbVillageois] = gaulois;
			nbVillageois += 1;
		}
		System.out.println("Le gaulois" + gaulois.getNom() + "a débarqué dans le village" + getNom());
	}

	public Gaulois trouverHabitant(int numero) {
		Gaulois tst = villageois[numero - 1];
		System.out.println("Le villageois numero " + numero + " est " + tst.getNom() + " de force " + tst.getForce());
		return tst;
	}

	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + chef.getNom() + " vivent les légendaires gaulois:");
		for (int i = 0; i < villageois.length; i++) {
			if (villageois[i] != null) {
				System.out.println(villageois[i].getNom());
			}
		}
	}

	public static void main(String[] args) {
		Village irreductible = new Village("Village des irréductible", 30);
		// Gaulois gaulois = village.trouverHabitant(30);
		Chef abraracourcix = new Chef("Abraracourcix", 6, irreductible);
		irreductible.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Asterix", 8);
		irreductible.ajouterHabitant(asterix);
		// Gaulois gaulois = irreductible.trouverHabitant(1);
		// System.out.println(gaulois);
		Gaulois obelix = new Gaulois("Obelix", 25);
		irreductible.ajouterHabitant(obelix);
		irreductible.afficherVillageois();
	}
}
