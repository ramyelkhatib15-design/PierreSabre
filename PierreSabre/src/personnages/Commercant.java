package personnages;

public class Commercant extends Huamins {
	public Commercant(String nom , String boisson,int argent) {
		super(nom, boisson, argent);
	}
	
	public int se_faire_extorquer() {
		int argent_perdu = argent;
		argent = 0;
		parler("le monde est injuste");
		return argent_perdu;
	}
	public void recevoir_argent(int valeur) {
		parler(valeur + " !merci genereux donateur! ");
		argent +=valeur;
	}
	

}
