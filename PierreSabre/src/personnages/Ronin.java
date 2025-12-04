package personnages;

public class Ronin extends Huamins{
	private int honneur = 1;
	
	public Ronin(String nom,String boisson,int argent) {
		super(nom, boisson, argent);
		
	}
	public void donner(Commercant beneficiaire) {
		int somme_a_donner = (10*argent)/100;
		parler(beneficiaire.getNom() +"prend ces "+somme_a_donner+" sous");
		beneficiaire.recevoir_argent(somme_a_donner);
	}
	public void provoquer(Yakuza adversaire) {
		int force = honneur*2;
		if (force >= adversaire.getReputation()) {
			parler(" Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			parler("je tai eu petit  yakusa!");
			int argent_gagner = adversaire.perdre();
			argent +=argent_gagner;
			honneur ++;
			
		}
		else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(argent);
			argent = 0;
			honneur --;
		}
	}
	

}
