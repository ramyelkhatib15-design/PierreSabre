package histoire;

import personnages.Commercant;
import personnages.Huamins;
import personnages.Ronin;
import personnages.Yakuza;

public class Histoiretp4 {
	public static void main(String[] args) {
		
		
		Commercant Marco = new Commercant("Marco", "the",15 );
		Yakuza yakuza_le_noir = new Yakuza("yakuza le noir", "whisky", 45, "warsong");
		Ronin roro = new Ronin("Roro", "shochu.", 60);
		roro.provoquer(yakuza_le_noir);
		
		
		
	}

}
