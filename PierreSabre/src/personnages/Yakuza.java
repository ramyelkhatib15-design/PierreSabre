package personnages;

public class Yakuza extends Huamins{
	private int reputation = 0 ;
	private String clan;
	public Yakuza(String nom,String boisson , int argent,String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	@Override
	public void bonjour() {
		super.bonjour();
		parler("Mon clan est celui de "+ clan);
		
		
	}
	public void extorquer(Commercant victime) {
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		int somme = victime.se_faire_extorquer();
		argent+=somme;
		reputation ++;
		parler("J’ai piqué les" + somme+ "de"+ victime.getNom()+ " ce qui me fait "+ argent+" sous dans ma poche. Hi ! Hi !");
	}
	public int perdre() {
		reputation --;
		int somme_perdu = argent;
		argent = 0;
		parler("jai perdu mon duel et mes "+somme_perdu+" sous,snif..jai deshonore le clan de "+clan);
		return somme_perdu;
	}
	public void gagner(int gain) {
		argent +=gain;
		reputation++;
		parler(" Ce ronin pensait vraiment battre "+ nom + " du clan de" + clan+ "? Je l'ai dépouillé de ses "+gain+"  sous.");
	}
	public int getReputation() {
		return reputation;
	}

}
