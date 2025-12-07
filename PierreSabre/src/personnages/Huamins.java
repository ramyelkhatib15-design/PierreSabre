package personnages;

public class Huamins {
	protected String nom;
	protected String boisson_favorite;
	protected int argent ;
	protected Huamins memoire[] = new Huamins[30];
	protected int nombre_de_connaisannce =0;
	
	public Huamins(String nom , String boisson, int argent) {
		this.argent = argent;
		this.boisson_favorite = boisson;
		this.nom = nom;
	}
	
	public int getArgent() {
		return argent;
	}
	public String getBoisson_favorite() {
		return boisson_favorite;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(texte);
	}
	
	public void bonjour() {
		parler("bonjour ! je m apelle "+ nom + " jaime boire du " + boisson_favorite);
	}
	public void boire() {
		parler("Mmmm, un bon verre de"+boisson_favorite+ "! GLOUPS !");
	}
	public void acheter(String bien,int prix) {
		if (argent >=prix) {
			parler("jai "+ argent+ "sous en poche je vais pouvoir m ofrrir un" +bien+"a "+prix);
			argent = argent - prix;
		}
		else {
			parler("je n ai plus que "+ argent+ "sous en poche je ne peux pas  m ofrrir un" +bien+"a "+prix);
		}
	}
	protected  void gagner_argent(int gain) {
		argent = argent + gain;
		
	}
	protected void perdre_argent(int perte) {
		argent = argent - perte;
	}
	public void Faireconnaissance(Huamins humain) {
		bonjour();
		humain.repondre(this);
		memorieser(humain);
		
	}
	private void memorieser(Huamins humain) {
		if (nombre_de_connaisannce< 30) {
			memoire[nombre_de_connaisannce] = humain;
			nombre_de_connaisannce++;	
		}
		
		
		
	}
	private void repondre(Huamins humain) {
		bonjour();
		memorieser(humain);
		
	}
	public void listerConnaissance() {
		
		System.out.print("Je connais beaucoup de monde dont: ");
		for (Huamins huamins : memoire) {
			if (huamins != null) {
				System.out.print(huamins.getNom() + " ");
				
			}	
		}
		System.out.println();
		
	}
	
	

}
