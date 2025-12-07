package personnages;

public class Samourai extends Huamins {
	private String seigneur ;
	public Samourai(String nom,String boisson,String seigneur,int argent) {
		super(nom, boisson, argent);
		this.seigneur = seigneur;
	}
	@Override
	public void bonjour() {
		super.bonjour();
		parler("je suis fier de servir le seigneur "+ seigneur);
		
	}
	public void boire(String boisson) {
		parler(" Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre "+boisson);
		boisson_favorite = boisson;
		
	}
	

}
