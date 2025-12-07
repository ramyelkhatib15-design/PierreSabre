package personnages;
import java.util.Random;

public class Traitre extends Samourai{
	private Random random = new Random();
	private int niveauTraitise = 0;
	public Traitre(String nom ,String boisson,String chef,int argent) {
		super(nom, boisson, chef, argent);
		
	}
	@Override
	public void bonjour() {
		super.bonjour();
		parler("Mais je suis un traitre et mon niveau de traitise est "+niveauTraitise+" Chut!");
	}
	public void ranconner(Commercant commercant) {
		if (niveauTraitise <3) {
			int somme_gagner = (commercant.getArgent())/10;
			commercant.perdre_argent(somme_gagner);
			gagner_argent(somme_gagner);
			niveauTraitise ++;
			parler("Si tu veux ma protection contre les Yakuzas il va falloir payer donne moi  "+ somme_gagner+" sous ou gare a toi!");
			commercant.parler("Tout de suite grand "+this.nom);	
		}
		else {
			parler("Mince je ne plus raconner personne sinon un samourai risque de me demasquer!");
		}
		
	}
	public void FaireLeGentil() {
		if (niveauTraitise>=1) {
			int don = (argent)/20;
			int indexAleatoire = random.nextInt(nombre_de_connaisannce);
			Huamins personneChoisie = memoire[indexAleatoire];
			parler("il faut abosulument remonter ma cote de confiance je vais faire ami avec "+ personneChoisie);;
			parler("Bonjour l ami! je voudrais vous aider en vous donnant "+ don+" sous" );
			personneChoisie.gagner_argent(don);
			perdre_argent(don);
			personneChoisie.parler("Merci "+ personneChoisie.getNom() + " Vous etes quelqu un de bien");
			if (niveauTraitise>1) {
				niveauTraitise --;	
			}
		}
		else {
			parler("Je ne peux pas faire ami avec personne car je ne connais personne!Snif");
			
		}
	}
	

}
